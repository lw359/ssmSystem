package com.guigu.service.wangzhijun;


import com.github.pagehelper.PageInfo;
import com.guigu.pojo.wangzhijun.WzjOrderr;

public interface YhyxdService {
    PageInfo<WzjOrderr> selectfenye(Integer pageno, Integer pagesize, WzjOrderr orderr);

    int xiugaiZt(WzjOrderr orderr);
}
