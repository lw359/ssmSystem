package com.guigu.mapper.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjOrderr;

import java.util.List;

public interface YhyxdMapper {
    List<WzjOrderr> chaxun(WzjOrderr orderr);

    int xiugaiZt(WzjOrderr orderr);
}
