package com.mrzhou.game.datapool;

import com.mrzhou.game.module.hero.Hero;

/**
 * 抽象数据池
 */
public abstract class DataPool {

    public abstract <T> Hero getData(String type, Integer level, Class<T> tClass);
}
