package com.doart.ds1.dao.demo;

import com.doart.ds1.entity.demo.SmuConfigBean;
import com.doart.ds1.entity.demo.SmuModelBean;
import com.doart.ds1.entity.demo.StationInfoBean;
import com.doart.ds1.entity.demo.SysUserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 保存用户.
     * @param user 用户信息
     */
    void saveUser(SysUserBean user);

    SysUserBean queryUser();

    SmuModelBean querySmuModelById(Long id);

    SmuConfigBean querySmuConfig(Long id);
}
