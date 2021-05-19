package com.guigu.pojo.wangzhijun;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName(value = "orderr")
public class WzjOrderr {
@TableId(value = "oid",type = IdType.AUTO)
private Integer oid;
@TableField("ddId")
private Integer ddId;

@TableField("ddTime")
@JsonFormat(pattern = "yyyy-MM-dd")
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date ddTime;

@TableField("shTime")
@JsonFormat(pattern = "yyyy-MM-dd")
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date shTime;
    @TableField("sHId")
private Integer sHId;
    @TableField("spId")
private Integer spId;
    @TableField("ddType")
private String ddType;
    @TableField("shouhuoRen")
private String shouhuoRen;
    @TableField("phone")
private String phone;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public Date getDdTime() {
        return ddTime;
    }

    public void setDdTime(Date ddTime) {
        this.ddTime = ddTime;
    }

    public Date getShTime() {
        return shTime;
    }

    public void setShTime(Date shTime) {
        this.shTime = shTime;
    }

    public Integer getsHId() {
        return sHId;
    }

    public void setsHId(Integer sHId) {
        this.sHId = sHId;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getDdType() {
        return ddType;
    }

    public void setDdType(String ddType) {
        this.ddType = ddType;
    }

    public String getShouhuoRen() {
        return shouhuoRen;
    }

    public void setShouhuoRen(String shouhuoRen) {
        this.shouhuoRen = shouhuoRen;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
