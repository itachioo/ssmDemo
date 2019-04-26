package cn.code.dao;

import cn.code.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

public interface SuccessKilledDao {
    int insertSuccessKill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
