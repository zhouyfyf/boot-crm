package com.itxiaozhou.crm.mapper;

import com.itxiaozhou.crm.pojo.Customer;
import com.itxiaozhou.crm.pojo.QueryVo;

import java.util.List;

/**
 * 客户信息持久化接口
 */
public interface CustomerMapper {
    /**
     * 根据查询条件，分页查询用户列表
     * @param vo
     * @return
     */
    List<Customer> getCustomerByQueryVo(QueryVo vo);

    /**
     * 根据查询条件，查询用户总记录数
     * @param vo
     * @return
     */
    Integer getCountByQueryVo(QueryVo vo);

    /**
     * 根据id查询客户
     * @param id
     * @return
     */
    Customer getCustomerById(Integer id);

    /**
     * 更新客户
     * @param customer
     */
    void updateCustomer(Customer customer);

    /**
     * 删除客户
     * @param id
     */
    void deleteCustomer(Integer id);
}
