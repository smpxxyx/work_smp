package com.erp.service;

import com.erp.pojo.TouSu;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface TouSuService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param tousu
     */
    void update(TouSu tousu);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    TouSu findById(int id);
    /**
     * 增加功能
     * @param tousu
     */
    void add(TouSu tousu);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<TouSu> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<TouSu> findAll();
}
