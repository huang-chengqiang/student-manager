package com.faine.ts.service;

import com.faine.ts.utils.ResultEntity;
import org.junit.Test;
import static org.junit.Assert.*;
import com.faine.ts.factory.ServiceFactory;

public class AdminServieTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("faine@qq.com","123456");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}