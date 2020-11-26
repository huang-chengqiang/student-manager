package com.faine.ts.service.impl;

import com.faine.ts.dao.DepartmentDao;
import com.faine.ts.entity.Department;
import com.faine.ts.factory.DaoFactory;
import com.faine.ts.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ ClassName DepartmentServicelmpl
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/11/23
 */
public class DepartmentServicelmpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
