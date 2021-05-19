package com.guigu.mapper.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjMerchantUsers;
import com.guigu.pojo.wangzhijun.WzjOrderr;

import java.util.List;

public interface QbddMapper {
    List<WzjOrderr> Qbddchaxun(WzjOrderr orderr);

    WzjMerchantUsers selectSh(Integer yhid);
}
