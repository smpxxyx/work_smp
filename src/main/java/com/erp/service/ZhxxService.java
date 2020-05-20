package com.erp.service;

import com.erp.pojo.Zhxx;
import com.erp.util.EasyUiResultUtil;
import java.util.List;

public interface ZhxxService {

    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     * 修改内容
     * @param zhxx
     */
    void update(Zhxx zhxx);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Zhxx findById(int id);
    /**
     * 增加功能
     * @param zhxx
     */
    void add(Zhxx zhxx);

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Zhxx> page(int pageNum, int pageSize);

    /**
     * 查询所有部门id:name 做数据回显
     * @return
     */
    List<Zhxx> findAll();
}
