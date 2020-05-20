package com.erp.service.impl;


import com.erp.mapper.ZhxxMapper;
import com.erp.pojo.Zhxx;
import com.erp.service.ZhxxService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhxxServiceImpl implements ZhxxService {
    @Autowired
    private ZhxxMapper zhxxMapper;

    @Override
    public void remove(Integer[] ids) {
        zhxxMapper.remove(ids);
    }

    @Override
    public void update(Zhxx zhxx) {
        zhxxMapper.update(zhxx);
    }

    @Override
    public Zhxx findById(int id) {
        return zhxxMapper.findById(id);
    }

    @Override
    public void add(Zhxx zhxx) {
        zhxxMapper.add(zhxx);
    }

    @Override
    public EasyUiResultUtil<Zhxx> page(int pageNum, int pageSize) {
        //return zhxxMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Zhxx>(zhxxMapper.count(),zhxxMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Zhxx> findAll() {
        return zhxxMapper.findAll();
    }
}
