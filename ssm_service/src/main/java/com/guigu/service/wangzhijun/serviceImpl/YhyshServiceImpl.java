package com.guigu.service.wangzhijun.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.wangzhijun.YhyshMapper;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.YhyshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YhyshServiceImpl implements YhyshService {
    @Autowired
    private YhyshMapper yhyshMapper;

    @Override
    public PageInfo<WzjOrderr> selectByyh(Integer pageno, Integer pagesize, WzjOrderr orderr) {
        PageHelper.startPage(pageno,pagesize);
        List<WzjOrderr> chaxunn = yhyshMapper.chaxun(orderr);
        PageInfo<WzjOrderr> Infos = new PageInfo<WzjOrderr>(chaxunn);
        return Infos;
    }
}
