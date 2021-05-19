package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Goods;
import org.apache.ibatis.annotations.Select;

public interface GoodsMapper extends BaseMapper<Goods> {
    @Select("SELECT COUNT(*) AS shangjiaSl FROM goods WHERE spStat='S-001'")
    int selectShangjiaSl();
}
