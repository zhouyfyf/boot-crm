package com.itxiaozhou.crm.service.impl;

import com.itxiaozhou.crm.mapper.BaseDictMapper;
import com.itxiaozhou.crm.pojo.BaseDict;
import com.itxiaozhou.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getBaseDictBycode(String code) {
        return baseDictMapper.getBaseDictBycode(code);
    }
}
