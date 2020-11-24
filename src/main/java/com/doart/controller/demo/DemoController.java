package com.doart.controller.demo;

import com.doart.ds1.entity.demo.SysUserBean;
import com.doart.ds2.entity.demo.DataConfigBean;
import com.doart.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * 服务器端口号。
     * 从yml中读取
     */
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/queryAllUserInfo")
    public String queryAllUserInfo() {

        List<SysUserBean> sysUserBeans = demoService.queryAllUserInfo();
        List<DataConfigBean> dataConfigBean =  demoService.queryAllDataConfigInfo();
        return dataConfigBean.get(0).toString() + "<br>" + sysUserBeans.get(0).toString();
    }

    @RequestMapping("/hello")
    public String hello() {

        try {
            // demoService.saveUser();
            // demoService.saveDataConfig();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return serverPort;
    }

    @RequestMapping("/queryUser")
    public String queryUser() {

        // SysUserBean user = demoService.queryUser();
        List<SysUserBean> sysUserBeans = demoService.queryAllUserInfo();
        return "1111";
    }


    @RequestMapping("/querySmuModel")
    public String querySmuModel() {

        demoService.querySmuModel();
        return "1111";
    }
}
