package cn.jmu.service;

import cn.jmu.bean.SeatSelection;
import cn.jmu.bean.SeatSelectionExample;
import cn.jmu.dao.SeatSelectionMapper;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import net.sf.jsqlparser.JSQLParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SeatSelectionService {
    @Autowired
    SeatSelectionMapper seatSelectionMapper;

    @Transactional
    public boolean insertSeatSelection(SeatSelection seatSelection)throws SQLServerException {
        return seatSelectionMapper.insertSelective(seatSelection);
    }
    public List<SeatSelection> findSeatSelection(String executiveflightid){
        SeatSelectionExample seatSelectionExample=new SeatSelectionExample();
        SeatSelectionExample.Criteria criteria=seatSelectionExample.createCriteria();
        criteria.andExecutiveflightidEqualTo(executiveflightid);
        seatSelectionExample.setOrderByClause("seatid asc");
        return seatSelectionMapper.selectByExample(seatSelectionExample);
    }
}
