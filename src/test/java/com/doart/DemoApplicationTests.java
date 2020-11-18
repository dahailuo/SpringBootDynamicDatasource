package com.doart;

import com.doart.ds1.entity.demo.SysUserBean;
import com.doart.ds2.entity.demo.DataConfigBean;
import com.doart.service.demo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {

        List<SysUserBean> listA = demoService.queryAllUserInfo();
        List<DataConfigBean> listB = demoService.queryAllDataConfigInfo();
        System.out.println(listA.get(0).toString());
        System.out.println("===============================");
        System.out.println(listB.get(0).toString());
    }

}
