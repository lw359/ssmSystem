package com.guigu.pojo.wangzhijun;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName(value = "dingdan")
public class WzjDingdan {
    @TableId(value = "ddId",type = IdType.AUTO)
    private Integer ddId;
    private Integer sl;
    private Integer zj;
    private Integer uid;
    private Integer gwId;
    private String ddZt;
    private Integer shid;
}
