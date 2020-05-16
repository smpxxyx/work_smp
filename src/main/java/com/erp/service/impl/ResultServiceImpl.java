package com.erp.service.impl;

import com.erp.mapper.ResultMapper;
import com.erp.pojo.Result;
import com.erp.service.ResultService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultMapper resultMapper;

    @Override
    public void remove(Integer[] ids) {
        resultMapper.remove(ids);
    }

    @Override
    public void update(Result result) {
        resultMapper.update(result);
    }

    @Override
    public Result findById(int id) {
        return resultMapper.findById(id);
    }

    @Override
    public void add(Result result) {
        resultMapper.add(result);
    }

    @Override
    public EasyUiResultUtil<Result> page(int pageNum, int pageSize) {
        //return resultMapper.page((pageNum-1)*pageSize,pageSize);
        return new EasyUiResultUtil<Result>(resultMapper.count(),resultMapper.page((pageNum-1)*pageSize,pageSize));
    }

    @Override
    public List<Result> findAll() {
        return resultMapper.findAll();
    }
}
