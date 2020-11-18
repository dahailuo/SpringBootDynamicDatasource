package com.doart.service.demo.impl;

import com.doart.datasource.DynamicDataSource;
import com.doart.datasource.DynamicDataSourceNames;
import com.doart.ds1.dao.demo.SysUserDao;
import com.doart.ds1.entity.demo.SysUserBean;

import com.doart.ds2.dao.demo.DataConfigDao;
import com.doart.ds2.entity.demo.DataConfigBean;
import com.doart.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    /**
     * 用户表DAO接口.
     */
    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private DataConfigDao dataConfigDao;

    @Override
    public List<SysUserBean> queryAllUserInfo() {

        return sysUserDao.queryAllUserList();
    }

    @DynamicDataSource(name = DynamicDataSourceNames.ULS)
    @Override
    public List<DataConfigBean> queryAllDataConfigInfo() {

        return dataConfigDao.queryDataConfigList();
    }

    @Override
    public void queryAll() {

        List<SysUserBean> a = queryAllUserInfo();
        System.out.println("第一个数据源="+ a.get(0).toString());
        List<DataConfigBean> b = queryAllDataConfigInfo();
        System.out.println("第二个数据源="+ b.get(0).toString());
    }
}
