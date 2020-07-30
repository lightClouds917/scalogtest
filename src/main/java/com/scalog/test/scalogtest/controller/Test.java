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
     * 测试url:http://localhost:1111/test/test?name=aaaaaaaa
     * @param name
     * @return
     * @throws Exception
     */
    @LogInfo(moduleName = "金融模块",functionName = "扣减授信",remark = "测试用的")
    @GetMapping("test")
    public String test(String name) throws Exception {
        System.out.println("执行成功:"+ LocalDateTime.now().toString()+":" +name);
        System.out.println(environment.getProperty("scalog.countryName"));
        return "执行成功:"+ LocalDateTime.now().toString()+":" +name;
    }

}


