package com.erp.controller;

import com.erp.pojo.Result;
import com.erp.service.ResultService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @RequestMapping("findAll")
    public List<Result> findAll(){
        return resultService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        resultService.remove(ids);
        return true;
    }
    @RequestMapping("update")
    public boolean update(Result result){
        resultService.update(result);
        return true;
    }

    @RequestMapping("findById")
    public Result findById(int id){
        return resultService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(Result result){
        resultService.add(result);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<Result> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return resultService.page(pageNum,pageSize);
    }
}
