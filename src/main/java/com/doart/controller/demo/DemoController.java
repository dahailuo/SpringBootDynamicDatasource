package com.doart.controller.demo;

import com.doart.ds1.entity.demo.SysUserBean;
import com.doart.ds2.entity.demo.DataConfigBean;
import com.doart.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/queryAllUserInfo")
    public String queryAllUserInfo() {

        List<SysUserBean> sysUserBeans = demoService.queryAllUserInfo();
        List<DataConfigBean> dataConfigBean =  demoService.queryAllDataConfigInfo();
        return dataConfigBean.get(0).toString() + "<br>" + sysUserBeans.get(0).toString();

    }
}
