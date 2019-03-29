package com.mrzhou.game.datapool;


/**
 * 抽象数据池
 */
public abstract class DataPool {

    public abstract <T> T getData(String type, Integer level, Class<T> tClass);
}
