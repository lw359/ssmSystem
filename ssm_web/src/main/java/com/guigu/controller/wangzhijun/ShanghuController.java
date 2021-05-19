package com.guigu.controller.wangzhijun;

import com.github.pagehelper.PageInfo;
import com.guigu.pojo.wangzhijun.WzjMerchant;
import com.guigu.pojo.wangzhijun.WzjMerchantUsers;
import com.guigu.pojo.wangzhijun.WzjOrderr;
import com.guigu.service.wangzhijun.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@CrossOrigin
public class ShanghuController {

    @Autowired
    private QbddService qbddService;
    @Autowired
    private DgysfhService dgysfhService;
    @Autowired
    private ShyshService shyshservice;
    @Autowired
    private YhyshService yhyshService;
    @Autowired
    private YhyxdService yhyxdService;

    public WzjMerchantUsers shchaxun(Integer iid){
        WzjMerchantUsers users = qbddService.selectShByuid(iid);
//        if(users.getMerchant_state() != "M-002"){
//            System.out.println("该商户审核未通过");
//        }if(users == null ){
//            System.out.println("该用户未开通商户");
//        }

            return users;

    }

    //    全部订单查询
    @RequestMapping("/chaxun.action")
    public PageInfo<WzjOrderr> chaxun(Integer pagesize, Integer pageno,
                                      WzjOrderr orderr, Integer yhid
                                   ){
        WzjMerchantUsers shchaxun = shchaxun(yhid);
        orderr.setsHId(shchaxun.getsHId());
        PageInfo<WzjOrderr> orderrs = qbddService.selectAll(pageno,pagesize,orderr);
        return orderrs;
    }

//    查询用户已下单的订单
    @RequestMapping("/yhyxdchaxun.action")
    public PageInfo<WzjOrderr> yhyxdchaxun(Integer pagesize, Integer pageno,
                                           WzjOrderr orderr, Integer yhid){
        WzjMerchantUsers shchaxun = shchaxun(yhid);
        orderr.setsHId(shchaxun.getsHId());
        PageInfo<WzjOrderr> selectfenye = yhyxdService.selectfenye(pageno, pagesize, orderr);
        return selectfenye;
    }

//    修改用户已下单订单状态，向供应商进货
    @RequestMapping("/yhyxdxg.action")
    public int yhyxdxg(WzjOrderr orderr){
        int i = yhyxdService.xiugaiZt(orderr);
        return i;
    }

    //    待供应商处理订单查询
    @RequestMapping("/dfhchaxun.action")
    public PageInfo<WzjOrderr> dfhchaxun(Integer pagesize, Integer pageno,
                                         WzjOrderr orderr, Integer yhid){
        WzjMerchantUsers shchaxun = shchaxun(yhid);
        orderr.setsHId(shchaxun.getsHId());
        PageInfo<WzjOrderr> chacun = dgysfhService.chacun(pageno, pagesize, orderr);
        return chacun;
    }

    //    修改供应商发货状态
    @RequestMapping("/dfhchaxiugai.action")
    public int dfhchaxiugai(WzjOrderr orderr){
        Date date = new Date();
        orderr.setShTime(date);
        WzjMerchant merchant = new WzjMerchant();
        int ztxiugai = dgysfhService.ztxiugai(orderr);
        return ztxiugai;
    }

   //    修改待供应商发货订单
   @RequestMapping("/xgdd.action")
   public int xgdd(WzjOrderr orderr){
        int ddxg = dgysfhService.ddxg(orderr);
        return ddxg;
    }

    //    商户已收货订单查询
    @RequestMapping("/shyshchaxun.action")
    public PageInfo<WzjOrderr> shyshchaxun(Integer pageno, Integer pagesize,
                                           WzjOrderr orderr, Integer yhid){
        WzjMerchantUsers shchaxun = shchaxun(yhid);
        orderr.setsHId(shchaxun.getsHId());
        PageInfo<WzjOrderr> chaxun = shyshservice.chaxun(pageno, pagesize, orderr);
        return chaxun;
    }

    //    修改商户发货状态
    @RequestMapping("/shfhxiugai.action")
    public int shfhxiugai(WzjOrderr orderr){
        System.out.println(orderr.getOid());
        int zt = shyshservice.ztxiugai(orderr);
        return zt;
    }

    //    用户已收货订单查询
    @RequestMapping("/yhyshchaxun.action")
    public PageInfo<WzjOrderr> yhyshchaxun(Integer pageno, Integer pagesize,
                                           WzjOrderr orderr, Integer yhid){
        WzjMerchantUsers shchaxun = shchaxun(yhid);
        orderr.setsHId(shchaxun.getsHId());
        PageInfo<WzjOrderr> yhysh = yhyshService.selectByyh(pageno, pagesize, orderr);
        return yhysh;
    }
}
