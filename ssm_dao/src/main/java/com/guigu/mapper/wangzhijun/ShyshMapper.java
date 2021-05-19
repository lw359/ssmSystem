package com.guigu.mapper.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjOrderr;

import java.util.List;

public interface ShyshMapper {
    List<WzjOrderr> chaxun(WzjOrderr orderr);
    int xiugai(WzjOrderr orderr);
}
