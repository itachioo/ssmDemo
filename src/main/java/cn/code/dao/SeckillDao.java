package cn.code.dao;

import cn.code.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    int reduceNumber(@Param("seckillId") long seckilId, @Param("killTime") Date killTime);
    Seckill queryById(long seckillId);
    List<cn.code.entity.Seckill> queryAll(@Param("offset") int off, @Param("limit") int limit);
}
