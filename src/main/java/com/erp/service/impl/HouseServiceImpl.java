package com.erp.service.impl;


import com.erp.mapper.HouseMapper;
import com.erp.pojo.House;
import com.erp.service.HouseService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    @Override
    public void remove(Integer[] ids) {
        houseMapper.remove(ids);
    }

    @Override
    public void update(House house) {
        houseMapper.update(house);
    }

    @Override
    public House findById(int id) {
        return houseMapper.findById(id);
    }

    @Override
    public void add(House house) {
        houseMapper.add(house);
    }

    @Override
    public EasyUiResultUtil<House> page(int pageNum, int pageSize) {
        //return houseMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<House>(houseMapper.count(),houseMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<House> findAll() {
        return houseMapper.findAll();
    }
}
