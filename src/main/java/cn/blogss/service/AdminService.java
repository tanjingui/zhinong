package cn.blogss.service;/*
    create by LiQiang at 2018/5/25   
*/

import cn.blogss.pojo.Admin;

public interface AdminService {
//    管理员登录验证
    public abstract Integer adminLogin(Admin admin);
}
