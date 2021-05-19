package com.guigu.service.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjMerchant;
import com.guigu.pojo.wangzhijun.WzjUsers;

public interface DengluService {
    WzjUsers selectby(WzjUsers users);

    int updateBysh(WzjMerchant merchant);

    int updateByyh(WzjUsers users);
}
