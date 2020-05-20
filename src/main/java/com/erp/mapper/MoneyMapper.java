package com.erp.mapper;

import com.erp.pojo.Money;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoneyMapper {
    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(@Param("ids") Integer[] ids);
    /**
     * 修改内容
     * @param money
     */
    void update(@Param("money") Money money);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Money findById(@Param("id") int id);
    /**
     * 增加功能
     * @param money
     */
    void add(@Param("money") Money money);

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
    List<Money> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    /**
     * 数据回显
     * @return
     */
    List<Money> findAll();
}
