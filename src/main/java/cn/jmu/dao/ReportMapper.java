package cn.jmu.dao;

import cn.jmu.bean.Report;

import java.util.List;

public interface ReportMapper {
    public List<Report> findReport(int mon);
}
