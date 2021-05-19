package com.guigu.service.wangzhijun.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.wangzhijun.YhyxdMapper;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.YhyxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YhyxdServiceImpl implements YhyxdService {
    @Autowired
    private YhyxdMapper yhyxdMapper;

    @Override
    public PageInfo<WzjOrderr> selectfenye(Integer pageno, Integer pagesize, WzjOrderr orderr) {
        PageHelper.startPage(pageno,pagesize);
        List<WzjOrderr> chaxun = yhyxdMapper.chaxun(orderr);
        PageInfo<WzjOrderr> orderrPageInfo = new PageInfo<>(chaxun);
        return orderrPageInfo;
    }

    @Override
    public int xiugaiZt(WzjOrderr orderr) {
        int i = yhyxdMapper.xiugaiZt(orderr);
        return i;
    }
}
