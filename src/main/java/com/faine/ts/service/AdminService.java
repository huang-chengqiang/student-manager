package com.faine.ts.service;

import com.faine.ts.utils.ResultEntity;

import java.sql.SQLException;

/**
 * @ ClassName AdminService
 * @ Description Admin业务逻辑接口
 * @ Author faine
 * @ Date 2020/11/18
 */

public interface AdminService {
    /**
     * 管理员登录
     *
     * @ param account:账号
     * @ return password:密码
     * @ throws ResultEntity:返回结果
     */
    ResultEntity adminLogin(String account,String password);
}
