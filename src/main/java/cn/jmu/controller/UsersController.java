package cn.jmu.controller;

import cn.jmu.bean.Administrator;
import cn.jmu.bean.Msg;
import cn.jmu.bean.Users;
import cn.jmu.service.AdministratorService;
import cn.jmu.service.UsersService;
import cn.jmu.utils.AliyunSmsUtils;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;
    @Autowired
    AdministratorService administratorService;
    //TODO:注册用户
    @PostMapping("/insertUsers")
    @ResponseBody
    @Transactional
    public Msg insertUsers(@Valid Users user, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object>map =new HashMap<String, Object>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError f:errors){
                System.out.println("错误的字段名："+f.getField());
                System.out.println("错误信息："+f.getDefaultMessage());
                map.put(f.getField(),f.getDefaultMessage());
            }
            return Msg.fail().add("errorFieles",map);
        }else{
            boolean flag=false;
            Users users=usersService.findUserByLoginID(user.getLoginid());
            if(users!=null){
                flag=false;
            }else{
                flag=usersService.InsertUser(user);
            }
            if(flag){
                return Msg.success();
            }else{
                return Msg.fail();
            }
        }
    }
    //TODO:账号密码登录
    @PostMapping("/logingCheck")
    @ResponseBody
    public Msg loginCheck(@RequestParam(value="id")String loginid,@RequestParam(value="pwd")String password, HttpSession session){
    	 Administrator administrator;
         Users users;
         administrator=administratorService.checkAdministrator(loginid,password);
         users = usersService.checkUser(loginid, password);

         if(users==null&&administrator==null){
             return Msg.fail();
         }else{
             if(users!=null) {
                 session.setAttribute("userid", users.getUserid());
                 session.setAttribute("username", users.getUsername());
             }else{
                 session.setAttribute("userid",administrator.getAdminid());
                 session.setAttribute("username",administrator.getLoginid());
                 session.setAttribute("admin","1");
             }
             return Msg.success();
         }
    }
    //TODO:根据id获取user
    @RequestMapping("/getUsers")
    @ResponseBody
    public Msg getUsers(@RequestParam(value="id")int userid){
        Users user = usersService.findUserByUserid(userid);
        return Msg.success().add("user",user);
    }
    //TODO:修改个人信息
    //并更新session
    @PostMapping("/updateUser")
    @ResponseBody
    @Transactional
    public Msg updateUser(@Valid Users user,BindingResult result,HttpSession session){
        if (result.hasErrors()){
            Map<String,Object> map = new HashMap<String, Object>();
            //校验失败，应该返回失败，在模态框中显示校验失败的错误信息
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError:errors){
                System.out.println("错误的字段名："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields",map);
        }else {
            usersService.updateUser(user);
            session.setAttribute("userid",user.getUserid());
            session.setAttribute("username",user.getUsername());
            return Msg.success();
        }
    }
    /**
     * 获取邮箱验证码
     * @return
     */
    @RequestMapping("/random")
    @ResponseBody
    public Msg getRandom(){
        String r = String.valueOf((int)(Math.random()*1000000));
        return Msg.success().add("ranNum", r);
    }
    /**
     * 调用阿里云短信平台接口并返回验证码
     * @param tel
     * @return
     */
    @RequestMapping("/sendToPhone")
    @ResponseBody
    public Msg sendPhone(@RequestParam(value="tel")String tel){
        String r = String.valueOf((int)(Math.random()*1000000));
        try {
            AliyunSmsUtils.sendSms(tel, r);
        } catch (ClientException e) {
            return Msg.fail();
        }
        return Msg.success().add("ranNum", r);
    }
    /**
     * 注销登录
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    @ResponseBody
    public Msg logout(HttpSession session){
    	session.invalidate();
    	return Msg.success();
    }
    /**
     * 订单成功短信
     * @param
     * @return
     */
    @RequestMapping("/sendOrderToPhone")
    @ResponseBody
    public Msg sendPhoneOrder(@RequestParam(value="telphone")String telp,@RequestParam(value="ft")String ft,@RequestParam(value="tt")String tt
    		,@RequestParam(value="fw")String fw,@RequestParam(value="tw")String tw
    		,@RequestParam(value="oid")String oid,@RequestParam(value="pas")String pas){
    	try {
            AliyunSmsUtils.sendSmsOrder(telp, ft, tt, fw, tw, oid, pas);
        } catch (ClientException e) {
            return Msg.fail();
        }
        return Msg.success();
    }
}
