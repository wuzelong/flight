package cn.jmu.service;

import cn.jmu.bean.Terminal;
import cn.jmu.bean.TerminalExample;
import cn.jmu.dao.TerminalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalService {
    @Autowired
    private TerminalMapper terminalMapper;
    public Terminal findTerminal(int AirportId){
        TerminalExample terminalExample=new TerminalExample();
        TerminalExample.Criteria criteria=terminalExample.createCriteria();
        criteria.andAirportidEqualTo(AirportId);
        List<Terminal> terminals=terminalMapper.selectByExample(terminalExample);
        if(terminals.size()==0){
            return null;
        }else {
            return terminals.get(0);
        }
    }
}
