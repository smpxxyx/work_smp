package com.erp.service;

import com.erp.pojo.Kcxx;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface KcxxService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param kcxx
     */
    void update(Kcxx kcxx);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Kcxx findById(int id);
    /**
     * 增加功能
     * @param kcxx
     */
    void add(Kcxx kcxx);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Kcxx> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Kcxx> findAll();
}
