package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("warehousing")
public class Warehousing {
    @TableId(value = "rkId",type = IdType.AUTO)
    private int rkId;
    @TableField("warehouseId")
    private  int warehouseId;
    @TableField("spName")
   private String spName;
    @TableField("spSl")
     private int   spSl;
    @TableField("scAdress")
   private String scAdress;
    @TableField("inStorage_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private Date inStorage_time;
    @TableField("car")
    private String car;
    @TableField("empName")
        private String empName;
}
