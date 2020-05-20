package com.erp.controller;

import com.erp.pojo.TouSu;
import com.erp.service.TouSuService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/tousu")
public class TouSuController {
    @Autowired
    private TouSuService tousuService;

    @RequestMapping("findAll")
    public List<TouSu> findAll(){
        return tousuService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        tousuService.remove(ids);
        return true;
    }
    @RequestMapping("update")
    public boolean update(TouSu tousu){
        tousuService.update(tousu);
        return true;
    }

    @RequestMapping("findById")
    public TouSu findById(int id){
        return tousuService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(TouSu tousu){
        tousuService.add(tousu);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<TouSu> page(@RequestParam(defaultValue = "1") int pageNum,
                                        @RequestParam(defaultValue = "2") int pageSize){
        return tousuService.page(pageNum,pageSize);
    }
}
