package com.guigu.controller.gys;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Goods;
import com.guigu.service.gys.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
@CrossOrigin
public class GysXxi {

    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodsMapper goodsMapper;

        //查询所有数据
        @RequestMapping("/showAll.action")
        @CrossOrigin
        public IPage<Goods> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                    @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                    Goods goods){
                //组装查询条件对象
            QueryWrapper<Goods> queryWrapper =new QueryWrapper<Goods>();
            if(!StringUtils.isEmpty(goods.getGoodsName())){
                queryWrapper.like("goodsName",goods.getGoodsName());  // where  name like '%val%'
            }
            queryWrapper.orderByAsc("spId");  //根据id列进行排序
            IPage<Goods>  iPage= goodsService.page(new Page<Goods>(pageno,pagesize),queryWrapper);
                return iPage;
        }

        //根据id查询数据用于编辑
    @RequestMapping("querySpbyid.action")
        public Goods querySpbyid (int id){
        Goods goods = goodsService.getById(id);
        return goods;
    }

    //根据id删除数据用于
    @RequestMapping("deleteSpbyid.action")
    public int deleteSpbyid (int id){
        int i = goodsService.DeleteById(id);
        return i;
    }
    //修改
    @RequestMapping("xiugaiSp.action")
    public int xiugaiSp (Goods goods){
        int update = goodsService.Update(goods);
        return update;
    }

    @RequestMapping("addSp.action")
    @ResponseBody
    public int addgoods (Goods goods, MultipartFile img2, HttpServletRequest request){
            if (img2!=null){
                String path =  request.getServletContext().getRealPath("/img");
                try {
                    img2.transferTo(new File(path,img2.getOriginalFilename()));

                    goods.setImg(img2.getOriginalFilename());
                }catch (IOException e){

                }
            }

            goods.setYsTime(new Date());
        int add = goodsService.add(goods);
        return add;
    }

    //查询上架数量
    @RequestMapping("selectShangjiaSl.action")
    public int selectShangjiaSl (){
        int i = goodsMapper.selectShangjiaSl();
        return i;
    }

}
