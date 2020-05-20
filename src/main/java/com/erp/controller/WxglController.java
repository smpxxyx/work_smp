package com.erp.controller;

import com.erp.pojo.Wxgl;
import com.erp.service.WxglService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/wxgl")
public class WxglController {
    @Autowired
    private WxglService wxglService;

    @RequestMapping("findAll")
    public List<Wxgl> findAll(){
        return wxglService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        wxglService.remove(ids);
        return true;
    }

    @RequestMapping("update")
    public boolean update(Wxgl wxgl){
        wxglService.update(wxgl);
        return true;
    }

    @RequestMapping("findById")
    public Wxgl findById(int id){
        return wxglService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(Wxgl wxgl){
        wxglService.add(wxgl);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<Wxgl> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return wxglService.page(pageNum,pageSize);
    }
}
