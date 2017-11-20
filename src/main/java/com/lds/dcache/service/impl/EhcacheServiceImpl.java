package com.lds.dcache.service.impl;

import com.lds.dcache.service.EhcacheService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EhcacheServiceImpl implements EhcacheService{

    @Override
    public Object findUserById(long id) {
        return null;
    }

    @Override
    public List findAllUser() {
        return null;
    }

    @Override
    public void saveAndFlush(Object user) {

    }

    @Override
    public void deleteUserById(long id) {

    }
}
