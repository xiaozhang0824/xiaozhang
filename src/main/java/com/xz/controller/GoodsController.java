package com.xz.controller;

import com.xz.bean.Goods;
import com.xz.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping("list")
    public String list(Model model){
        List<Goods> goodsList = goodsService.getGoodsList();
        model.addAttribute("list",goodsList);
        return "list";
    }

}
