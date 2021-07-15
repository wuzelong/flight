package cn.jmu.controller;

import cn.jmu.bean.BindingKey;
import cn.jmu.bean.BindingKey2;
import cn.jmu.bean.Msg;
import cn.jmu.bean.Passenger;
import cn.jmu.bean.Users;
import cn.jmu.service.BindingService;
import cn.jmu.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    @Autowired
    BindingService bindingService;

    //TODO:绑定
    @RequestMapping("/binding/{id}")
    @ResponseBody
    @Transactional
    public Msg insertBinding(@Valid @PathVariable("id")int userid, @Valid Passenger passenger, BindingResult result){
    	if (result.hasErrors()){
            Map<String,Object> map = new HashMap();
            //校验失败，应该返回失败，在模态框中显示校验失败的错误信息
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError:errors){
                System.out.println("错误的字段名："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields",map);
        }else {
            boolean flag=false;
            if(passengerService.findPassenger(passenger.getPassengerid())==null){
                passengerService.insertPassenger(passenger);
            }
            BindingKey binding=new BindingKey();
            binding.setPassengerid(passenger.getPassengerid());
            binding.setUserid(userid);
            flag=bindingService.insertBinding(binding);
            if(flag) {
                return Msg.success();
            }else {
                return Msg.fail();
            }
        }
    }

    //TODO:解绑
    @RequestMapping("/deletebinding")
    @ResponseBody
    @Transactional
    public Msg deleteBinding(@Valid @RequestParam(value="uid") int userid, @Valid @RequestParam(value="pid")String passengerid) {
        BindingKey binding=new BindingKey();
        binding.setPassengerid(passengerid);
        binding.setUserid(userid);
        if(bindingService.deleteBinding(binding)){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }
    @RequestMapping("/findPassenger")
    @ResponseBody
    public Msg findPassenger(@RequestParam(value="id")int userid){
    	List<BindingKey2> bindingKey2s=bindingService.findBindingByUserid(userid);
        return Msg.success().add("passenger",bindingKey2s);
    }
}
