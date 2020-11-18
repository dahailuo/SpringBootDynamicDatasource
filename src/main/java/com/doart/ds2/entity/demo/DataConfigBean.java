package com.doart.ds2.entity.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 数据配置对象.
 */
public class DataConfigBean {

    /**
     * 主键.
     */
    @Getter @Setter
    private Long id;

    /**
     * 名称.
     */
    @Getter @Setter
    private String dataName;

    /**
     * 类型.
     */
    @Getter @Setter
    private String dataType;

    /**
     * 处理时间.
     */
    @Getter @Setter
    private String dataTime;

    /**
     * 表日期(针对分表).
     */
    @Getter @Setter
    private String tableDate;

    /**
     * 创建时间.
     */
    @Getter @Setter
    private Date createTime;

    @Override
    public String toString() {
        return "DataConfigBean{" +
                "id=" + id +
                ", dataName='" + dataName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", dataTime='" + dataTime + '\'' +
                ", tableDate='" + tableDate + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
