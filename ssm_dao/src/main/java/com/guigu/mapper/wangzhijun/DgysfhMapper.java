package com.guigu.mapper.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjOrderr;

import java.util.List;

public interface DgysfhMapper {
    List<WzjOrderr> gysfhchaxun(WzjOrderr orderr);

    int updataByid(WzjOrderr orderr);

    int xgddxx(WzjOrderr orderr);
}
