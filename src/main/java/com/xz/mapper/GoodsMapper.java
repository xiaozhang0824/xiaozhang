package com.xz.mapper;

import com.xz.bean.Goods;

import java.util.List;

public interface GoodsMapper {

    List<Goods> getGoodsList();

    Goods getGoodsByGid(Goods goods);

}
