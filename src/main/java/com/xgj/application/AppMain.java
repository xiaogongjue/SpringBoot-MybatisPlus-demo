package com.xgj.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: xgj
 * @Desc:
 * @Create: 2024/8/15
 * @Verson: 1.0
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages ="com.xgj.application.mapper")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }

}
