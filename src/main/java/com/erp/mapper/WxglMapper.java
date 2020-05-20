package com.erp.mapper;

import com.erp.pojo.Wxgl;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface WxglMapper {
    /**
     * 根据id进行删除--批量删除
     * @param ids
     */
    void remove(@Param("ids") Integer[] ids);
    /**
     * 修改内容
     * @param wxgl
     */
    void update(@Param("wxgl") Wxgl wxgl);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Wxgl findById(@Param("id") int id);
    /**
     * 增加功能
     * @param wxgl
     */
    void add(@Param("wxgl") Wxgl wxgl);

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
    List<Wxgl> page(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    /**
     * 数据回显
     * @return
     */
    List<Wxgl> findAll();
}
