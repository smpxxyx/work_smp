package com.erp.service;

import com.erp.pojo.Wxgl;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface WxglService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param wxgl
     */
    void update(Wxgl wxgl);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Wxgl findById(int id);
    /**
     * 增加功能
     * @param wxgl
     */
    void add(Wxgl wxgl);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Wxgl> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Wxgl> findAll();
}
