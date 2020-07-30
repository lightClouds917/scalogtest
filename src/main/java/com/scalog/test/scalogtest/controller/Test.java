package com.scalog.test.scalogtest.controller;

import com.java4all.scalog.annotation.LogInfo;
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

    @LogInfo(moduleName = "金融模块",functionName = "扣减授信",remark = "测试用的")
    @GetMapping("test")
    public String test(String name) throws Exception {
        System.out.println("lalalal"+name);
        Map<String, String> getenv = System.getenv();
        System.out.println(environment.getProperty("scalog.countryName"));

        return name;
    }

//    private DataSource get() throws Exception {
//        ServiceLoader<IDataSource> load = ServiceLoader.load(IDataSource.class);
//        System.out.println(load.iterator().hasNext());
//        for(IDataSource dataSource : load){
//            System.out.println(dataSource.getClass().getName());
//            IDataSource dataSource1 = dataSource.getClass().newInstance();
//            Object dataSource2 = dataSource1.getDataSource();
//            System.out.println(dataSource2);
//            Class<?> aClass = Class.forName(dataSource.getClass().getName(), true,
//                    this.getClass().getClassLoader());
//        }
//
//        return null;
//    }
}
//https://www.cnblogs.com/yjbjingcha/p/6752265.html
//        https://blog.csdn.net/u010502101/article/details/78705030
