package com.doart.ds1.entity.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class InverterModelBean implements Serializable {

    private Long id;
    private String name;
    private Long smuId;
    private Long invId;
    private Long sessionId;
    private Integer startEnergy;
    private Date updateDate;
    private Integer version;
    private String invVer;
    private String plcSlaveVer;
    private Integer position1;
    private Integer position2;
    private Integer position3;
    private Integer position4;
    private Double lat;
    private Double lon;
    private String remarks;
    private Date powerOnTime;
    private Integer status;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Integer sort;
    private String localId;
    private String localSmu;
    private Integer delFlag;
    private String location;
    private Date warrantyTime;
    private Long acBusId;
}
