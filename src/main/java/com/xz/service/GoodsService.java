package com.xz.service;

import com.xz.bean.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> getGoodsList();

    Goods getGoodsByGid(Goods goods);

}
