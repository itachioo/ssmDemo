package cn.code.dao;

import cn.code.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    int reduceNumber(long seckilId, Date killTime);
    Seckill queryById(long seckillId);
    List<cn.code.entity.Seckill> queryAll(int off, int limit);
}
