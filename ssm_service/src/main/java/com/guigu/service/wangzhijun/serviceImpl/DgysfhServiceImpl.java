package com.guigu.service.wangzhijun.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.wangzhijun.DgysfhMapper;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.DgysfhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DgysfhServiceImpl implements DgysfhService {

@Autowired
private DgysfhMapper dgysfhMapper;


    @Override
    public PageInfo<WzjOrderr> chacun(Integer pageno, Integer pagesize, WzjOrderr orderr) {
        PageHelper.startPage(pageno,pagesize);
        List<WzjOrderr> gysfhchaxun = dgysfhMapper.gysfhchaxun(orderr);
        PageInfo<WzjOrderr> orderrPageInfo = new PageInfo<>(gysfhchaxun);
        return orderrPageInfo;
    }

    @Override
    public int ztxiugai(WzjOrderr orderr) {
        int i = dgysfhMapper.updataByid(orderr);
        return i;
    }

    @Override
    public int ddxg(WzjOrderr orderr) {
        int xgddxx = dgysfhMapper.xgddxx(orderr);
        return xgddxx;
    }
}
