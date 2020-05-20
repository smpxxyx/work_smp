package com.erp.controller;

import com.erp.pojo.Money;
import com.erp.service.MoneyService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//@Controller
@RestController//@Controller和@ResponseBody的合体
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("findAll")
    public List<Money> findAll(){
        return moneyService.findAll();
    }

    @RequestMapping("remove")
    public boolean remove(Integer[] ids){
        moneyService.remove(ids);
        return true;
    }

    @RequestMapping("update")
    public boolean update(Money money){
        moneyService.update(money);
        return true;
    }

    @RequestMapping("findById")
    public Money findById(int id){
        return moneyService.findById(id);
    }
    //@ResponseBody//返回json对象
    @RequestMapping("add")
    public boolean add(Money money){
        moneyService.add(money);
        return true;
    }
    //@ResponseBody//返回json对象
    @RequestMapping("/page")
    public EasyUiResultUtil<Money> page(@RequestParam(defaultValue = "1") int pageNum,
                                       @RequestParam(defaultValue = "2") int pageSize){
        return moneyService.page(pageNum,pageSize);
    }
}
