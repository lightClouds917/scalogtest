package com.scalog.test.scalogtest.controller;

import com.java4all.scalog.annotation.LogInfo;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.ServiceLoader;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhongxiang
 * @date 2020年07月14日 18:35:44
 */
@RequestMapping("test")
@RestController
public class Test {

    @Autowired
    private Environment environment;

    /**
     * 测试url:http://localhost:1111/testPublic/test?name=aaaaaaaa
     * @param name
     * @return
     * @throws Exception
     */
    @LogInfo(moduleName = "金融模块",functionName = "测试方法级别",remark = "public方法")
    @GetMapping("testPublic")
    public String testPublic(String name) throws Exception {
        System.out.println("testPublic执行成功:"+ LocalDateTime.now().toString()+":" +name);
        System.out.println(environment.getProperty("scalog.countryName"));
        return "testPublic执行成功:"+ LocalDateTime.now().toString()+":" +name;
    }

    @LogInfo(moduleName = "金融模块",functionName = "测试方法级别",remark = "private方法")
    @GetMapping("testPrivate")
    private String testPrivate(String name){
        System.out.println("testPrivate执行成功:"+ LocalDateTime.now().toString()+":" +name);
        return "testPrivate执行成功:"+ LocalDateTime.now().toString()+":" +name;
    }

    @LogInfo(moduleName = "金融模块",functionName = "测试方法级别",remark = "protected方法")
    @GetMapping("testProtected")
    protected String testProtected(String name){
        System.out.println("testProtected执行成功:"+ LocalDateTime.now().toString()+":" +name);
        return "testProtected执行成功:"+ LocalDateTime.now().toString()+":" +name;
    }

    @GetMapping("testno")
    public String testno(String name){
        System.out.println("testno执行成功:"+ LocalDateTime.now().toString()+":" +name);
        return "testno执行成功:"+ LocalDateTime.now().toString()+":" +name;
    }

    @GetMapping("testentity")
    public String testEntity(Credit credit){
        System.out.println("testentity执行成功:"+ LocalDateTime.now().toString()+":" +credit.toString());
        return "testentity执行成功:"+ LocalDateTime.now().toString()+":" +credit.toString();
    }

}


