package com.doart.ds1.entity.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class StationInfoBean {

    private Long id;
    private Long parentId;
    private String parentIds;
    private Integer smuModelId;
    private String name;
    private Double price;
    private Integer officeId;
    private Integer isSmu;
    private String classification;
    private Double baiduLng;
    private Double baiduLat;
    private Double gaodeLng;
    private Double gaodeLat;
    private Double googleLng;
    private Double googleLat;
    private String areaId;
    private String imageUrl;
    private Long updateBy;
    private Long createBy;
    private String remark;
    private Date createTime;
    private Date modifyTime;
    private Integer delFlag;
    private Integer voltage;
    private Date regTime;
    private String location;
    private String devCompany;
    private String sortField;
    private String isConnect;
}
