package com.itxiaozhou.crm.service;

import com.itxiaozhou.crm.pojo.Customer;
import com.itxiaozhou.crm.pojo.QueryVo;
import com.itxiaozhou.crm.utils.Page;

public interface CustomerService {
    /**
     * 根据查询条件，分页查询用户列表
     * @param vo
     * @return
     */
    Page<Customer> getCustomerByQueryVo(QueryVo vo);

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
