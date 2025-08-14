package com.wsw.service.impl;

import com.wsw.dao.LogDao;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description LogService实现类
 */
@Service
public class LogServiceImpl implements com.wsw.service.LogService {
    private final LogDao logDao;

    public LogServiceImpl(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" + out + "到" + in + "，金额：" + money);
    }
}
