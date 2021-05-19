package com.guigu.service.wangzhijun.serviceImpl;

import com.guigu.mapper.wangzhijun.DengluMapper;
import com.guigu.pojo.wangzhijun.WzjMerchant;
import com.guigu.pojo.wangzhijun.WzjUsers;
import com.guigu.service.wangzhijun.DengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DengluServiceImpl implements DengluService {
@Autowired
    private DengluMapper dengluMapper;


    @Override
    public WzjUsers selectby(WzjUsers users) {
        WzjUsers chaxun = dengluMapper.chaxun(users);
        return chaxun;
    }

    @Override
    public int updateBysh(WzjMerchant merchant) {
        return dengluMapper.xiugaiSh(merchant);

    }

    @Override
    public int updateByyh(WzjUsers users) {
        return   dengluMapper.xiugaiYh(users);

    }
}
