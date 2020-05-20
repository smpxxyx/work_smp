package com.erp.service.impl;


import com.erp.mapper.WxglMapper;
import com.erp.pojo.Wxgl;
import com.erp.service.WxglService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxglServiceImpl implements WxglService {
    @Autowired
    private WxglMapper wxglMapper;

    @Override
    public void remove(Integer[] ids) {
        wxglMapper.remove(ids);
    }

    @Override
    public void update(Wxgl wxgl) {
        wxglMapper.update(wxgl);
    }

    @Override
    public Wxgl findById(int id) {
        return wxglMapper.findById(id);
    }

    @Override
    public void add(Wxgl wxgl) {
        wxglMapper.add(wxgl);
    }

    @Override
    public EasyUiResultUtil<Wxgl> page(int pageNum, int pageSize) {
        //return wxglMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Wxgl>(wxglMapper.count(),wxglMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Wxgl> findAll() {
        return wxglMapper.findAll();
    }
}
