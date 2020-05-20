package com.erp.service;

import com.erp.pojo.Money;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface MoneyService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param money
     */
    void update(Money money);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Money findById(int id);
    /**
     * 增加功能
     * @param money
     */
    void add(Money money);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Money> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Money> findAll();
}
