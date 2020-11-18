package com.doart.service.demo;

import com.doart.ds1.entity.demo.SysUserBean;
import com.doart.ds2.entity.demo.DataConfigBean;

import java.util.List;

/**
 * 服务层接口.
 */
public interface DemoService {

    /**
     * 查询所有用户信息.
     * @return 所有用户信息集合
     */
    List<SysUserBean> queryAllUserInfo();

    /**
     * 查询所有配置信息.
     * @return 所有配置信息集合
     */
    List<DataConfigBean> queryAllDataConfigInfo();

    /**
     * 调用两个数据源.
     */
    void queryAll();
}
