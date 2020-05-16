package com.erp.service.impl;

import com.erp.mapper.KcxxMapper;
import com.erp.pojo.Kcxx;
import com.erp.service.KcxxService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KcxxServiceImpl implements KcxxService {
    @Autowired
    private KcxxMapper kcxxMapper;

    @Override
    public void remove(Integer[] ids) {
        kcxxMapper.remove(ids);
    }

    @Override
    public void update(Kcxx kcxx) {
        kcxxMapper.update(kcxx);
    }

    @Override
    public Kcxx findById(int id) {
        return kcxxMapper.findById(id);
    }

    @Override
    public void add(Kcxx kcxx) {
        kcxxMapper.add(kcxx);
    }

    @Override
    public EasyUiResultUtil<Kcxx> page(int pageNum, int pageSize) {
        //return KcxxMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Kcxx>(kcxxMapper.count(),kcxxMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Kcxx> findAll() {
        return kcxxMapper.findAll();
    }
}
