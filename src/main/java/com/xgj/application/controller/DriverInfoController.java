package com.xgj.application.controller;

import com.xgj.application.common.Result;
import com.xgj.application.entity.DriverInfo;
import com.xgj.application.service.DriverInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Auther: xgj
 * @Desc:
 * @Create: 2024/8/15
 * @Verson: 1.0
 */
@Tag(name = "老师API接口管理")
@RestController
@RequestMapping(value = "/driver")
public class DriverInfoController {

    @Autowired
    private DriverInfoService driverInfoService;


    @Operation(summary = "老司机查询")
    @GetMapping("/login/{code}")
    public Result login(@PathVariable("code") String code) {

        int anInt = new Random().nextInt(100);
        String str = anInt + "你好，我是刘老师！" + code;
        System.out.println(str);

        DriverInfo login = driverInfoService.login(code);
        return Result.ok(login);
    }

    @Operation(summary = "老司机查询222")
    @GetMapping("/query/{code}")
    public Result query(@PathVariable("code") String code) {

        int anInt = new Random().nextInt(100);
        String str = anInt + "你好，我是刘老师！" + code;
        System.out.println(str);
        return Result.ok(str);
    }
}
