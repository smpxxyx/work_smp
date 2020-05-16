package com.erp.controller;

import com.erp.pojo.Kcxx;
import com.erp.service.KcxxService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/kcxx")
public class KcxxController {
    @Autowired
    private KcxxService kcxxService;

    @RequestMapping("findAll")
    public List<Kcxx> findAll(){
        return kcxxService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        kcxxService.remove(ids);
        return true;
    }

    @RequestMapping("update")
    public boolean update(Kcxx kcxx){
        kcxxService.update(kcxx);
        return true;
    }

    @RequestMapping("findById")
    public Kcxx findById(int id){
        return kcxxService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(Kcxx kcxx){
        kcxxService.add(kcxx);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<Kcxx> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return kcxxService.page(pageNum,pageSize);
    }
}
