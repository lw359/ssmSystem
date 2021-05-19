package com.guigu.service.wangzhijun;



import com.github.pagehelper.PageInfo;
import com.guigu.pojo.wangzhijun.WzjMerchantUsers;
import com.guigu.pojo.wangzhijun.WzjOrderr;

public interface QbddService {

    PageInfo<WzjOrderr> selectAll(Integer pageno, Integer pagesize, WzjOrderr orderr);

    WzjMerchantUsers selectShByuid(Integer yhid);
}
