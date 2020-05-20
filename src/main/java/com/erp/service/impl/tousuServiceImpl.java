package com.erp.service.impl;

import com.erp.mapper.TouSuMapper;
import com.erp.pojo.TouSu;
import com.erp.service.TouSuService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class tousuServiceImpl implements TouSuService {
    @Autowired
    private TouSuMapper tousuMapper;

    @Override
    public void remove(Integer[] ids) {
        tousuMapper.remove(ids);
    }

    @Override
    public void update(TouSu tousu) {
        tousuMapper.update(tousu);
    }

    @Override
    public TouSu findById(int id) {
        return tousuMapper.findById(id);
    }

    @Override
    public void add(TouSu tousu) {
        tousuMapper.add(tousu);
    }

    @Override
    public EasyUiResultUtil<TouSu> page(int pageNum, int pageSize) {
        //return tousuMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<TouSu>(tousuMapper.count(),tousuMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<TouSu> findAll() {
        return tousuMapper.findAll();
    }
}
