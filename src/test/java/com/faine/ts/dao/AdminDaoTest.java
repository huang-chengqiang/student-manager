package com.faine.ts.dao;

import com.faine.ts.entity.Admin;
import com.faine.ts.factory.DaoFactory;
import org.junit.Test;

import static org.junit.Assert.*;
import java.sql.SQLException;

public class AdminDaoTest {

    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("faine@qq.com");
            assertEquals("faine", admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}