package com.faine.ts.factory;

import com.faine.ts.dao.AdminDao;
import com.faine.ts.dao.DepartmentDao;
import com.faine.ts.dao.impl.AdminDaoImpl;
import com.faine.ts.dao.impl.DepartmentDaoImpl;
import com.faine.ts.entity.Department;

/**
 * @ ClassName DaoFactory
 * @ Description 工厂类
 * @ Author faine
 * @ Date 2020/11/18
 */
public class DaoFactory {
    /**
     * 获得AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }
    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentInstance(){
        return new DepartmentDaoImpl();
    }
}
