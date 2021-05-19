package com.guigu.controller.wangzhijun;
import com.guigu.mapper.wangzhijun.DengluMapper;
import com.guigu.pojo.wangzhijun.WzjMerchant;
import com.guigu.pojo.wangzhijun.WzjMerchantUsers;
import com.guigu.pojo.wangzhijun.WzjUsers;
import com.guigu.service.wangzhijun.DengluService;
import com.guigu.service.wangzhijun.QbddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


@CrossOrigin
@RestController
@RequestMapping("/shdl")
public class ShdengluController {

@Autowired
    private DengluService dengluService;

@Autowired
    private QbddService qbddService;

@Autowired
        private DengluMapper dengluMapper;

//用户登录
@RequestMapping("/dlyz.action")
  public WzjUsers dlyz(WzjUsers users ){
    WzjUsers selectby = dengluService.selectby(users);
    if(selectby != null){
    return selectby;
     }else {
    return null;
    }
};

//商户信息查询
@RequestMapping("/shanghuchaxun.action")
    public WzjMerchantUsers shanghuchaxun(Integer id){
    WzjMerchantUsers users = qbddService.selectShByuid(id);
    return  users;
}

//商户信息修改
    @RequestMapping("/shxxxiugai.action")
    public int shxxxiugai(WzjMerchantUsers merchantUsers){
        WzjMerchant merchant=new WzjMerchant();
        merchant.setsHId(merchantUsers.getsHId());
        merchant.setPhone(merchantUsers.getPhone());
        merchant.setMenDianAdrss(merchantUsers.getMenDianAdrss());
        merchant.setShStat(merchantUsers.getShStat());

        WzjUsers users=new WzjUsers();
        users.setID(merchantUsers.getYhid());
        users.setEmail(merchantUsers.getEmail());

        int i = dengluService.updateBysh(merchant);
        int i1 = dengluService.updateByyh(users);
        int ii =i+i1;
        return ii;
    }

    @RequestMapping("xiugaiTx.action")
    @ResponseBody
    public int addgoods (WzjUsers user, MultipartFile img2, HttpServletRequest request){
        if (img2!=null){
            String path =  request.getServletContext().getRealPath("/img");
            try {
                img2.transferTo(new File(path,img2.getOriginalFilename()));
                user.setPhoto(img2.getOriginalFilename());
            }catch (IOException e){

            }
        }
        int i = dengluMapper.upTx(user);
        return i;
    }

}
