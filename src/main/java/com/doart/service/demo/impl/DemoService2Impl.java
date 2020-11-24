package com.doart.service.demo.impl;

import com.doart.ds1.dao.demo.SysUserDao;
import com.doart.ds1.entity.demo.SysUserBean;
import com.doart.ds2.dao.demo.DataConfigDao;
import com.doart.service.demo.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class DemoService2Impl implements DemoService2 {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private DataConfigDao dataConfigDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveUser() {

        SysUserBean user = new SysUserBean();
        user.setUserName("test222");
        user.setLoginName("test222");
        user.setPassword("123456");
        user.setEmail("111111");
        user.setPhone("11111111111222");
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        user.setCreateBy("1");
        user.setUpdateBy("1");
        user.setDelFlag(0);
        user.setLoginIp("192.168.1.1");
        user.setLoginTime(new Date());
        sysUserDao.saveUser(user);
        if (true) {

            throw new RuntimeException("自定义异常");
        }
    }

    @Override
    public void saveDataConfig() {

    }
}
