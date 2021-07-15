package cn.jmu.service;

import cn.jmu.bean.BindingKey;
import cn.jmu.bean.BindingKey2;
import cn.jmu.dao.BindingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BindingService {
    @Autowired
    private BindingMapper bindingMapper;
    @Transactional
    public boolean insertBinding(BindingKey binding){
        return bindingMapper.insert(binding);
    }
    @Transactional
    public boolean deleteBinding(BindingKey binding){
        return bindingMapper.deleteByPrimaryKey(binding);
    }
    public List<BindingKey2> findBindingByUserid(int userid){
        return bindingMapper.selectByUserId(userid);
    }
}
