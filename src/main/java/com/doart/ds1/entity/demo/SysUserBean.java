package com.doart.ds1.entity.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
public class SysUserBean {

    /**
     * 用户ID.
     */
    @Getter @Setter
    private Long id;

    /**
     * 姓名.
     */
    @Getter @Setter
    private String userName;

    /**
     * 机构ID.
     */
    @Getter @Setter
    private Long officeId;

    /**
     * 用户在钉钉中的userId.
     */
    @Getter @Setter
    private String userId;

    /**
     * 登录名.
     */
    @Getter @Setter
    private String loginName;

    /**
     * 密码.
     */
    @Getter @Setter
    private String password;

    /**
     * 邮箱.
     */
    @Getter @Setter
    private String email;

    /**
     * 电话.
     */
    @Getter @Setter
    private String telephone;

    /**
     * 手机.
     */
    @Getter @Setter
    private String phone;

    /**
     * 创建时间.
     */
    @Getter @Setter
    private Date createTime;

    /**
     * 修改时间.
     */
    @Getter @Setter
    private Date modifyTime;

    /**
     * 创建者.
     */
    @Getter @Setter
    private String createBy;

    /**
     * 更新者.
     */
    @Getter @Setter
    private String updateBy;

    /**
     * 删除标记.
     * 0、未删除
     * 1、已删除
     */
    @Getter @Setter
    private Integer delFlag;

    /**
     * 最近登录IP.
     */
    @Getter @Setter
    private String loginIp;

    /**
     * 最近登录时间.
     */
    @Getter @Setter
    private Date loginTime;
}
