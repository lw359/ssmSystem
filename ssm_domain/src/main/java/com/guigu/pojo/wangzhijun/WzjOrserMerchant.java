package com.guigu.pojo.wangzhijun;

import lombok.Data;

import java.util.Date;

@Data
public class WzjOrserMerchant extends WzjOrderr {
    private Integer oid;
    private Integer ddId;
    private Date ddTime;
    private Date shTime;
    private Integer sHId;
    private Integer spId;
    private String ddType;
    private String shouhuoRen;
    private String phone;

    @Override
    public Integer getOid() {
        return oid;
    }

    @Override
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    @Override
    public Integer getDdId() {
        return ddId;
    }

    @Override
    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    @Override
    public Date getDdTime() {
        return ddTime;
    }

    @Override
    public void setDdTime(Date ddTime) {
        this.ddTime = ddTime;
    }

    @Override
    public Date getShTime() {
        return shTime;
    }

    @Override
    public void setShTime(Date shTime) {
        this.shTime = shTime;
    }

    @Override
    public Integer getsHId() {
        return sHId;
    }

    @Override
    public void setsHId(Integer sHId) {
        this.sHId = sHId;
    }

    @Override
    public Integer getSpId() {
        return spId;
    }

    @Override
    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    @Override
    public String getDdType() {
        return ddType;
    }

    @Override
    public void setDdType(String ddType) {
        this.ddType = ddType;
    }

    @Override
    public String getShouhuoRen() {
        return shouhuoRen;
    }

    @Override
    public void setShouhuoRen(String shouhuoRen) {
        this.shouhuoRen = shouhuoRen;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
