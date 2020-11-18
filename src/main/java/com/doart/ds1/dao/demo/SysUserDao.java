package com.doart.ds1.dao.demo;

import com.doart.ds1.entity.demo.SysUserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户管理Dao.
 */

@Mapper
public interface SysUserDao {

    /**
     * 查询所有用户信息.
     * @return 用户信息列表
     */
    List<SysUserBean> queryAllUserList();
}
