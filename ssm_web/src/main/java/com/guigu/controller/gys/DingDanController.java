package com.guigu.controller.gys;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Deng.D_yuangongMapper;
import com.guigu.mapper.DingdanXqMapper;
import com.guigu.mapper.GoodsMapper;
import com.guigu.mapper.WarehousingMapper;
import com.guigu.pojo.*;
import com.guigu.pojo.Deng.D_yuangongPojo;
import com.guigu.service.gys.CarService;
import com.guigu.service.gys.DdXqService;
import com.guigu.service.gys.DingDanService;
import com.guigu.service.gys.WarehousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("DingDan")
public class DingDanController {
    @Autowired
    WarehousingService warehousingService;
            @Autowired
            D_yuangongMapper d_yuangongMapper;

            @Autowired
    GoodsMapper goodsMapper;

            @Autowired
    DingdanXqMapper dingdanXqMapper;
            @Autowired
    WarehousingMapper warehousingMapper;

        @Autowired
        DingDanService dingDanService;
        @Autowired(required = false)
    DdXqService ddXqService;

        @Autowired
    CarService carService;
    //查询所有数据
    @RequestMapping("/showAll.action")
    @CrossOrigin
    public IPage<DingDan> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                  @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                  DingDan dingDan){
        //组装查询条件对象
        QueryWrapper<DingDan> queryWrapper =new QueryWrapper<DingDan>();
            queryWrapper.eq("ddZt","d-001");  // where  name like '%val%'
        queryWrapper.orderByAsc("ddId");  //根据id列进行排序
        IPage<DingDan>  iPage= dingDanService.page(new Page<DingDan>(pageno,pagesize),queryWrapper);
        return iPage;
    }
    //根据id查询数据用于
    @RequestMapping("queryDdbyid.action")
    public Goods querySpbyid (int id){

        return null;
    }

    //查询订单详情
    //查询所有数据
    @RequestMapping("/showAllDdXq.action")
    @CrossOrigin
    public IPage<DdXq> showAllDdXq(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                   @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                   DdXq ddXq){
        //组装查询条件对象
        QueryWrapper<DdXq> queryWrapper =new QueryWrapper<DdXq>();
        if(ddXq.getDdId()!=0){
            ddXq.setDdType("W-002");
            queryWrapper.eq("ddId",ddXq.getDdId());
            queryWrapper.eq("ddType",ddXq.getDdType());
            // where  name like '%val%'
        }
        queryWrapper.orderByAsc("ddId");  //根据id列进行排序
        IPage<DdXq>  iPage= ddXqService.page(new Page<DdXq>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //修改订单状态查询数据用于
    @RequestMapping("ddPd.action")
    public int ddPd (DingDan dingDan){
        dingDan.setDdZt("d-002");
        int i =dingDanService.updateddZt(dingDan);
        return i;
    }

    //查询出已受理的订单详情
    @RequestMapping("/selectDdXq.action")
    @CrossOrigin
    public IPage<DdXq> selectDdXq(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                   @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                   DdXq ddXq){
        //组装查询条件对象
        QueryWrapper<DdXq> queryWrapper =new QueryWrapper<DdXq>();
            queryWrapper.eq("ddType",ddXq.getDdType());
            // where  name like '%val%'
        queryWrapper.orderByAsc("ddId");  //根据id列进行排序
        IPage<DdXq>  iPage= ddXqService.page(new Page<DdXq>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //修改详细订单状态查询数据用于
    @RequestMapping(value = "XiuGaiDdXq.action",produces = {"application/json;charset=utf-8"})
    public int XiuGaiDdXq (DdXq ddXq){
        //状态为已受理  发货了
        ddXq.setDdType("W-009");
        int i = ddXqService.updateddXxZt(ddXq);
        return i;
    }
    //修改详细订单状态查询数据用于确认发货中
    @RequestMapping(value = "qr.action",produces = {"application/json;charset=utf-8"})
    public int qr (DdXq ddXq){
        //状态为已受理
        int i = dingdanXqMapper.updateztsq(ddXq.getOid());
        return i;
    }
    //展示所有车辆信息
    @RequestMapping("selectCar.action")
    @CrossOrigin
    public IPage<Car> selectCar(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                Car car, int  oid){
        //组装查询条件对象
        //状态为已受理  发货了
        int updatezt = dingdanXqMapper.updatezt(oid);
        QueryWrapper<Car> queryWrapper =new QueryWrapper<Car>();
        queryWrapper.orderByAsc("id");  //根据id列进行排序
        IPage<Car>  iPage= carService.page(new Page<Car>(pageno,pagesize));
        return iPage;
    }
    //展示所有用户信息
    @RequestMapping("selectUser.action")
    @CrossOrigin
    public List<D_yuangongPojo> selectUser(){
        //组装查询条件对象
        List<D_yuangongPojo> d_yuangongPojos = d_yuangongMapper.selectList(null);
        return d_yuangongPojos;
    }
    //展示id查询商品名字信息
    @RequestMapping("selectSp.action")
    @CrossOrigin
    public Goods selectSp(Goods goods){
        //组装查询条件对象
        Goods goods1 = goodsMapper.selectById(goods.getSpId());
        return goods1;
    }

    //添加入库详情
    @RequestMapping("ruKuCk.action")
    @CrossOrigin
    public int ruKuCk(Warehousing warehousing){
            warehousing.setWarehouseId(1);
            warehousing.setInStorage_time(new Date());
        //组装查询条件对象
        int insert = warehousingMapper.insert(warehousing);
        return insert;
    }
    //查询出已受理的订单详情
    @RequestMapping("/RuKuChaXun.action")
    @CrossOrigin
    public IPage<Warehousing> RuKuChaXun(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                  @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                  Warehousing warehousing){
        //组装查询条件对象
        QueryWrapper<Warehousing> queryWrapper =new QueryWrapper<Warehousing>();
        queryWrapper.orderByAsc("rkId");  //根据id列进行排序
        IPage<Warehousing>  iPage= warehousingService.page(new Page<Warehousing>(pageno,pagesize));
        System.out.println(iPage);
        return iPage;
    }
}
