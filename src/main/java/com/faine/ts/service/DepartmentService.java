package com.faine.ts.service;

import com.faine.ts.entity.Department;

import java.util.List;

/**
 * @ Description DepartmentService
 * @ Author faine
 * @ Date 2020/11/23
 */
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();
}
