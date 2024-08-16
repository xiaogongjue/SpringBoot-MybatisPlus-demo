package com.xgj.application.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xgj.application.entity.DriverInfo;
import com.xgj.application.mapper.DriverInfoMapper;
import com.xgj.application.service.DriverInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: xgj
 * @Desc:
 * @Create: 2024/8/16
 * @Verson: 1.0
 */

@Slf4j
@Service
public class DriverInfoServiceImpl extends ServiceImpl<DriverInfoMapper, DriverInfo> implements DriverInfoService {


    @Autowired
    private DriverInfoMapper driverInfoMapper;


    @Override
    public DriverInfo login(String code) {
        QueryWrapper<DriverInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("id", code);
        DriverInfo DriverInfo = driverInfoMapper.selectById(code);


        QueryWrapper<DriverInfo> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("phone", "12345678901");

        List<DriverInfo> driverInfos = driverInfoMapper.selectList(objectQueryWrapper);
        driverInfos.forEach(item->{
            System.out.println(item);
        });

        log.info("DriverInfo: {}", DriverInfo);


        return DriverInfo;
    }
}
