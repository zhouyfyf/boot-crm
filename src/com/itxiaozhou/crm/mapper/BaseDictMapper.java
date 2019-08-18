package com.itxiaozhou.crm.mapper;

import com.itxiaozhou.crm.pojo.BaseDict;

import java.util.List;

/**
 * 字典数据表持久化接口
 */
public interface BaseDictMapper {
    /**
     * 根据字典编码查询字典列表
     * @param code
     * @return
     */
    List<BaseDict> getBaseDictBycode(String code);
}
