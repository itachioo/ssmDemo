package cn.code.service;

import cn.code.dto.Exposer;
import cn.code.dto.SeckillExecution;
import cn.code.entity.Seckill;
import cn.code.exception.RepeatKillException;
import cn.code.exception.SeckillCloseException;
import cn.code.exception.SeckillException;

import java.util.List;

public interface SeckillService {
    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    Exposer exportSeckillUrl(long seckillId);

    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;
}
