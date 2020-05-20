package com.erp.service.impl;


import com.erp.mapper.MoneyMapper;
import com.erp.pojo.Money;
import com.erp.service.MoneyService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public void remove(Integer[] ids) {
        moneyMapper.remove(ids);
    }

    @Override
    public void update(Money money) {
        moneyMapper.update(money);
    }

    @Override
    public Money findById(int id) {
        return moneyMapper.findById(id);
    }

    @Override
    public void add(Money money) {
        moneyMapper.add(money);
    }

    @Override
    public EasyUiResultUtil<Money> page(int pageNum, int pageSize) {
        //return moneyMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Money>(moneyMapper.count(),moneyMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Money> findAll() {
        return moneyMapper.findAll();
    }
}
