package com.wsw.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description log业务层接口
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface LogService {
    void log(String out, String in, Double money);
}
