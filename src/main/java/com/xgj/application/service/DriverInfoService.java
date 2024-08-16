package com.xgj.application.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.application.entity.DriverInfo;

/**
 * @Auther: xgj
 * @Desc:
 * @Create: 2024/8/16
 * @Verson: 1.0
 */

public interface DriverInfoService extends IService<DriverInfo> {
    DriverInfo login(String code);
}
