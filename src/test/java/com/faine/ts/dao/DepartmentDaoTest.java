package com.faine.ts.dao;

import com.faine.ts.entity.Department;
import com.faine.ts.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


import static org.junit.Assert.*;

public class DepartmentDaoTest {

    private final DepartmentDao departmentDao = DaoFactory.getDepartmentInstance();

    @Test
    public void getAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        }catch (SQLException e){
            e.printStackTrace();
        }
        assert departmentList != null;
        departmentList.forEach(System.out::println);
    }
}