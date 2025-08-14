package com.wsw.service.impl;

import com.wsw.dao.ResourceDao;
import com.wsw.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    private final ResourceDao resourceDao;

    public ResourceServiceImpl(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }

    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.openURL(url, password);
    }
}
