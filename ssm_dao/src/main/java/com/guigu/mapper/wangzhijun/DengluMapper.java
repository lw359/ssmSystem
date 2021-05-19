package com.guigu.mapper.wangzhijun;

import com.guigu.pojo.wangzhijun.WzjMerchant;
import com.guigu.pojo.wangzhijun.WzjUsers;


public interface DengluMapper {
    WzjUsers chaxun(WzjUsers users);

    int xiugaiSh(WzjMerchant merchant);

            int upTx(WzjUsers users);

    int xiugaiYh(WzjUsers users);
}
