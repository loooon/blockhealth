package com.example.demo.service;

import com.example.demo.component.InfoDaoEM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSqlServiceImpl extends DataSqlService{

    @Autowired
    private InfoDaoEM infoDaoEM;

    @Override
    public List<String> getColumn(List<String> list1) {
        return infoDaoEM.getColumn(list1);
    }

    @Override
    public List<Object[]> getInfoByVid(String name, List<String> list1) {
        return infoDaoEM.getInfoByVid(name,list1);
    }

    @Override
    public List<Object[]> getColumnBySQL(List<String> SQLColumn) {
        return infoDaoEM.getColumnBySQL(SQLColumn);
    }
}
