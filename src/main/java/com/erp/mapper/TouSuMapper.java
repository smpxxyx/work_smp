package com.erp.mapper;

import com.erp.pojo.TouSu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TouSuMapper {
    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(@Param("ids") Integer[] ids);
    /**
     * 修改内容
     * @param tousu
     */
    void update(@Param("tousu") TouSu tousu);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    TouSu findById(@Param("id") int id);
    /**
     * 增加功能
     * @param tousu
     */
    void add(@Param("tousu") TouSu tousu);

    /**
     * 获取总数
     * @return
     */
    int count();
    /**
     * 分页查询
     * @param startNum 起始位置
     * @param pageSize 每页条数
     * @return
     */
    List<TouSu> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    /**
     * 数据回显
     * @return
     */
    List<TouSu> findAll();
}
