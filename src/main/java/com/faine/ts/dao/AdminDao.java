package com.faine.ts.dao;

import com.faine.ts.entity.Admin;

import java.sql.SQLException;

/**
 * @ Description 管理员接口
 * @ Author faine
 * @ Date 2020/11/18
 */
public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account:账号入参
     * @return Admin:管理员信息
     * @throws SQLException 该方法会抛出SQL异常
     */
    Admin findAdminByAccount(String account) throws SQLException;
}
