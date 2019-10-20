package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.util.SqlSessionUtil;

/**
 * Author 山东彭于晏
 * 2019/10/20
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
