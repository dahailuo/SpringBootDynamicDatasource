package com.doart.ds2.dao.demo;

import com.doart.ds2.entity.demo.DataConfigBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据配置管理Dao.
 */
@Mapper
public interface DataConfigDao {

    /**
     * 查询所有配置信息.
     * @return 配置信息列表
     */
    List<DataConfigBean> queryDataConfigList();
}
