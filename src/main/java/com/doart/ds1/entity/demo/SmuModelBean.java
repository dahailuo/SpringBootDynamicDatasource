package com.doart.ds1.entity.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class SmuModelBean implements Serializable {

    private SmuConfigBean smuConfigBean;
    private List<InverterModelBean> inverterList;

    private Long id;
    private Integer officeId;
    private String name;
    private Long smuId;
    private Double baiduLng;
    private Double baiduLat;
    private Double gaodeLng;
    private Double gaodeLat;
    private Double googleLng;
    private Double googleLat;
    private Integer areaId;
    private Integer lineP;
    private Integer initEnergy;
    private Integer invNum;
    private Integer cmpNum;
    private Integer cmpPower;
    private Double capacity;
    private String devCompany;
    private String location;
    private String pic;
    private String projectMap;
    private Double energyC;
    private Integer aXiang;
    private Integer bXiang;
    private Integer cXiang;
    private Integer rootType;
    private Integer type;
    private String remark;
    private Date createTime;
    private Date modifyTime;
    private Integer delFlag;
    private Long createBy;
    private Long updateBy;
    private Date warrantyTime;
    private String cmpAngle;
    private Long cabinetId;
}