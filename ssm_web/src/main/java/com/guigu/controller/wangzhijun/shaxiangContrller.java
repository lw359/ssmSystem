package com.guigu.controller.wangzhijun;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/zhifu")
public class shaxiangContrller {


    @RequestMapping("/moni.action")
    @CrossOrigin
    public String zhifi( HttpServletRequest request) {
         int a =100;
        System.out.println("进了"+a);
        request.setAttribute("as",a);
       // String a=String.valueOf(1000);
       //request.getRequestDispatcher("index.jsp").forward(request,response);
        return "forward:/index.jsp";

    }



}
