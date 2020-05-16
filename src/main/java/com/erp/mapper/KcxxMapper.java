package com.erp.mapper;

import com.erp.pojo.Kcxx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KcxxMapper {
    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(@Param("ids") Integer[] ids);
    /**
     * 修改内容
     * @param kcxx
     */
    void update(@Param("kcxx") Kcxx kcxx);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Kcxx findById(@Param("id") int id);
    /**
     * 增加功能
     * @param kcxx
     */
    void add(@Param("kcxx") Kcxx kcxx);

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
    List<Kcxx> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    /**
     * 数据回显
     * @return
     */
    List<Kcxx> findAll();
}
