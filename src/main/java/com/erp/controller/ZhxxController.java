package com.erp.controller;

import com.erp.pojo.Zhxx;
import com.erp.service.ZhxxService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/zhxx")
public class ZhxxController {
    @Autowired
    private ZhxxService zhxxService;

    @RequestMapping("findAll")
    public List<Zhxx> findAll(){
        return zhxxService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        zhxxService.remove(ids);
        return true;
    }

    @RequestMapping("update")
    public boolean update(Zhxx zhxx){
        zhxxService.update(zhxx);
        return true;
    }

    @RequestMapping("findById")
    public Zhxx findById(int id){
        return zhxxService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(Zhxx zhxx){
        zhxxService.add(zhxx);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<Zhxx> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return zhxxService.page(pageNum,pageSize);
    }
}
