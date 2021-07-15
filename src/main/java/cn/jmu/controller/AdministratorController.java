package cn.jmu.controller;

import cn.jmu.bean.Administrator;
import cn.jmu.bean.Msg;
import cn.jmu.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/administrator")
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;
    @RequestMapping("/loginCheck")
    public Msg loginCheck(@RequestParam(value="loginid")String loginid,
                          @RequestParam(value="password")String password, HttpSession session){
        Administrator administrator=administratorService.checkAdministrator(loginid, password);
        if(administrator==null){
            return Msg.fail();
        }else{
            session.setAttribute("adminid",administrator.getAdminid());
            session.setAttribute("loginid",administrator.getLoginid());
            return Msg.success().success();
        }
    }
    @RequestMapping("/logout")
    @ResponseBody
    public Msg logout(HttpSession session){
        session.invalidate();
        return Msg.success();
    }
}
