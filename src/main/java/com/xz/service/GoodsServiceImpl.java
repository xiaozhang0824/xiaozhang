package com.xz.service;

import com.xz.bean.Goods;
import com.xz.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    @Override
    public Goods getGoodsByGid(Goods goods) {
        return goodsMapper.getGoodsByGid(goods);
    }
}
