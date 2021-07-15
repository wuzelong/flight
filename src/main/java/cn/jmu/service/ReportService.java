package cn.jmu.service;

import cn.jmu.bean.Report;
import cn.jmu.dao.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    @Autowired
    ReportMapper reportMapper;

    public List<Report> findReports(int mon){
        return reportMapper.findReport(mon);
    }
}
