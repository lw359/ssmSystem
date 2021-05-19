package com.guigu.service.wangzhijun.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.wangzhijun.ShyshMapper;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.ShyshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShyshServiceImpl implements ShyshService {

@Autowired
private ShyshMapper shyshMapper;

    @Override
    public PageInfo<WzjOrderr> chaxun(Integer pageno, Integer pagesize, WzjOrderr orderr) {
        PageHelper.startPage(pageno,pagesize);
        List<WzjOrderr> chaxun = shyshMapper.chaxun(orderr);
        PageInfo<WzjOrderr> orderrPageInfo = new PageInfo<>(chaxun);
        return orderrPageInfo;
    }

    @Override
    public int ztxiugai(WzjOrderr orderr) {
        int xiugai = shyshMapper.xiugai(orderr);
        return xiugai;
    }
}
