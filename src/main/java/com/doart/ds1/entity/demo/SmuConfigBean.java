package com.doart.ds1.entity.demo;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class SmuConfigBean implements Serializable {

    private Long id;
    private String name;
    private String smuId;
    private String smuVer;
    private String smuWebVer;
    private String mac;
    private String wifiMac;
    private String meterAir;
    private String metertoGrid;
    private String metertoSolar;
    private String gprs;
    private Integer version;
    private Date installDate;
    private Date powerOnTime;
    private String plcMasterVer;
    private String smuModel;
    private String remarks;
    private Integer status;
    private Long sessionId;
    private Integer dataCenter;
    private Integer netType;
    private String simNo;
    private Integer realInvNum;
    private Integer thInvNum;
    private String hardWareVer;
    private String bootloaderVer;
    private String isOnline;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date modifyTime;
    private Integer delFlag;
    private String routeIp;
    private Date routeTime;
    private String loginIp;
    private String clientIp;
    private Date loginTime;
    private Date lastrequestTime;
    private Date logoutTime;
}
