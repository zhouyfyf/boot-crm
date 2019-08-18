package com.itxiaozhou.crm.service;

import com.itxiaozhou.crm.pojo.BaseDict;

import java.util.List;

/**
 * 字典数据表业务逻辑接口
 */
public interface BaseDictService {
    /**
     * 根据字典编码查询字典列表
     * @param code
     * @return
     */
    List<BaseDict> getBaseDictBycode(String code);
}
