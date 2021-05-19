package com.guigu.service.wangzhijun.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.wangzhijun.QbddMapper;
import com.guigu.pojo.wangzhijun.WzjMerchantUsers;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.QbddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QbddServiceImpl implements QbddService {
    @Autowired
    private QbddMapper qbddMapper;

    @Override
    public PageInfo<WzjOrderr> selectAll(Integer pageno, Integer pagesize, WzjOrderr orderr) {
        PageHelper.startPage(pageno,pagesize);
        List<WzjOrderr> qbddchaxun = qbddMapper.Qbddchaxun(orderr);
        PageInfo<WzjOrderr> orderrPageInfo = new PageInfo<WzjOrderr>(qbddchaxun);
        return orderrPageInfo;
    }

    @Override
    public WzjMerchantUsers selectShByuid(Integer yhid) {
        WzjMerchantUsers merchantUsers = qbddMapper.selectSh(yhid);
        return merchantUsers;
    }
}
