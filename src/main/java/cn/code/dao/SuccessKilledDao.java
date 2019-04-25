package cn.code.dao;

import cn.code.entity.SuccessKilled;

public interface SuccessKilledDao {
    int insertSuccessKill(long seckillId, long userPhone);
    SuccessKilled queryByIdWithSeckill(long seckillId, long userPhone);

}
