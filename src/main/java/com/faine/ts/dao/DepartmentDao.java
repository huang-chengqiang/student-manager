package com.faine.ts.dao;

import com.faine.ts.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ Description 院系DAO接口
 * @ Author faine
 * @ Date 2020/11/23
 */
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Dapartment>
     * @throws SQLException 异常
     */
    List<Department> getAll() throws SQLException;
}
