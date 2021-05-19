package com.guigu.service.wangzhijun;

import com.github.pagehelper.PageInfo;
import com.guigu.pojo.wangzhijun.WzjOrderr;

public interface ShyshService {
    PageInfo<WzjOrderr> chaxun(Integer pageno, Integer pagesize, WzjOrderr orderr);
    int ztxiugai(WzjOrderr orderr);
}
