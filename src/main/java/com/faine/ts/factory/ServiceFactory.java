package com.faine.ts.factory;

import com.faine.ts.service.AdminService;
import com.faine.ts.service.DepartmentService;
import com.faine.ts.service.impl.AdminServiceImpl;
import com.faine.ts.service.impl.DepartmentServicelmpl;

/**
 * @ ClassName ServiceFactory
 * @ Description Service工厂类
 * @ Author faine
 * @ Date 2020/11/19
 */
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
    public static DepartmentService getDepartmentServiceInstance(){
        return new DepartmentServicelmpl();
    }
}
