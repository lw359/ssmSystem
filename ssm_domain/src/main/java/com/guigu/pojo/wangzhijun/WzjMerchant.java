package com.guigu.pojo.wangzhijun;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName("merchant")
public class WzjMerchant {
    @TableId(value = "sHId",type = IdType.AUTO)
    private Integer sHId;
    private String phone;
    private String shangHuName;
    private String menDianAdrss;
    private String shStat;
    private Integer yl;
    private Integer ddId;
    private String mer_state;
    private int Uid;
    private int Yhid;

    public Integer getsHId() {
        return sHId;
    }

    public void setsHId(Integer sHId) {
        this.sHId = sHId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShangHuName() {
        return shangHuName;
    }

    public void setShangHuName(String shangHuName) {
        this.shangHuName = shangHuName;
    }

    public String getMenDianAdrss() {
        return menDianAdrss;
    }

    public void setMenDianAdrss(String menDianAdrss) {
        this.menDianAdrss = menDianAdrss;
    }

    public String getShStat() {
        return shStat;
    }

    public void setShStat(String shStat) {
        this.shStat = shStat;
    }

    public Integer getYl() {
        return yl;
    }

    public void setYl(Integer yl) {
        this.yl = yl;
    }

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public String getMer_state() {
        return mer_state;
    }

    public void setMer_state(String mer_state) {
        this.mer_state = mer_state;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public int getYhid() {
        return Yhid;
    }

    public void setYhid(int yhid) {
        Yhid = yhid;
    }
}
