package com.erp.service;

import com.erp.pojo.Result;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface ResultService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param result
     */
    void update(Result result);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Result findById(int id);
    /**
     * 增加功能
     * @param result
     */
    void add(Result result);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Result> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Result> findAll();
}
