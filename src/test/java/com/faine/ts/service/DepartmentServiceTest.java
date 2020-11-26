package com.faine.ts.service;

import com.faine.ts.entity.Department;
import com.faine.ts.factory.ServiceFactory;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;

public class DepartmentServiceTest {
    private final DepartmentService departmentService = ServiceFactory.getDepartmentServiceInstance();

    @Test
    public void selectAll() {
        List<Department> departmentList = departmentService.selectAll();
        departmentList.forEach(System.out::println);
    }
}