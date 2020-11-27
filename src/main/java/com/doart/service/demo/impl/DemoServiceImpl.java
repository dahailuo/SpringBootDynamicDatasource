package com.doart.service.demo.impl;

import com.doart.datasource.DynamicDataSource;
import com.doart.datasource.DynamicDataSourceNames;
import com.doart.ds1.dao.demo.SysUserDao;
import com.doart.ds1.entity.demo.SmuModelBean;
import com.doart.ds1.entity.demo.SysUserBean;

import com.doart.ds2.dao.demo.DataConfigDao;
import com.doart.ds2.entity.demo.DataConfigBean;
import com.doart.service.demo.DemoService;
import com.doart.service.demo.DemoService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    /**
     * 用户表DAO接口.
     */
    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private DataConfigDao dataConfigDao;

    @Autowired
    private DemoService2 demoService2;

    @Override
    public List<SysUserBean> queryAllUserInfo() {

        List<SysUserBean> list = sysUserDao.queryAllUserList();
        if (list == null) {

            System.out.println("list=="+ (list==null));
        } else {

            System.out.println("list.size=="+ list.size());
        }
        return list;
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

    @Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        rollbackFor = Exception.class,
        timeout = -1,
        readOnly = false
    )
    @Override
    public void saveUser() {

        SysUserBean user = new SysUserBean();
        user.setUserName("test111");
        user.setLoginName("test111");
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
    }

    @Transactional
    @DynamicDataSource(name = DynamicDataSourceNames.ULS)
    @Override
    public void saveDataConfig() {

        DataConfigBean data = new DataConfigBean();
        data.setDataName("test111");
        data.setDataType("inv_day111");
        data.setDataTime("2020-11-16 01:00:00");
        data.setTableDate("202011");
        data.setCreateTime(new Date());
        dataConfigDao.saveDataConfig(data);
        if (true) {

            throw new RuntimeException("自定义异常saveDataConfig");
        }
    }

    @Override
    public SysUserBean queryUser() {

        SysUserBean user = sysUserDao.queryUser();
        System.out.println("user==="+ (user == null));
        return user;
    }

    public void querySmuModel() {

        log.info("querySmuModel......");
        SmuModelBean model = sysUserDao.querySmuModelById(19L);
        System.out.println("model===" + model.toString());
    }
}
