package com.erp.controller;

import com.erp.pojo.House;
import com.erp.service.HouseService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @RequestMapping("findAll")
    public List<House> findAll(){
        return houseService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        houseService.remove(ids);
        return true;
    }

    @RequestMapping("update")
    public boolean update(House house){
        houseService.update(house);
        return true;
    }

    @RequestMapping("findById")
    public House findById(int id){
        return houseService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(House house){
        houseService.add(house);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<House> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return houseService.page(pageNum,pageSize);
    }
}
