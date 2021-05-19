package com.guigu.service.wangzhijun;

import com.github.pagehelper.PageInfo;
import com.guigu.pojo.wangzhijun.WzjOrderr;

public interface YhyshService {
    PageInfo<WzjOrderr> selectByyh(Integer pageno, Integer pagesize, WzjOrderr orderr);
}
