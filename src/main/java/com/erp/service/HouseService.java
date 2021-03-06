package com.erp.service;

import com.erp.pojo.House;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface HouseService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param house
     */
    void update(House house);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    House findById(int id);
    /**
     * 增加功能
     * @param house
     */
    void add(House house);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<House> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<House> findAll();
}
