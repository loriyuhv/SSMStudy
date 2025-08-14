package com.wsw.service.impl;

import com.wsw.dao.AccountDao;
import com.wsw.dao.LogDao;
import com.wsw.service.AccountService;
import com.wsw.service.LogService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description AccountService接口实现类
 */
@Service
public class AccountServiceImpl implements AccountService {
    private static final Log log = LogFactory.getLog(AccountServiceImpl.class);
    private final AccountDao accountDao;
    private final LogService logService;
    public AccountServiceImpl(AccountDao accountDao, LogService logService) {
        this.accountDao = accountDao;
        this.logService = logService;
    }

    @Override
    public void transfer(String out, String in, Double money) throws IOException {
        try {
            logService.log(out, in, money);
            int i = 10 / 0;
            // if (true) {throw new IOException();}
            accountDao.outMoney(out, money);
        } finally {
            accountDao.inMoney(in, money);
        }


    }
}
