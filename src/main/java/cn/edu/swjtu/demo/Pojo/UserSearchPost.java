package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class UserSearchPost {
    private Long recordId;

    private String cookieid;

    private Integer pid;

    private Integer cxid;

    private Integer cid;

    private Integer colorId;

    private String paifang;

    private Integer lichengRight;

    private Date time;

    private Integer lichengLeft;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getCookieid() {
        return cookieid;
    }

    public void setCookieid(String cookieid) {
        this.cookieid = cookieid == null ? null : cookieid.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCxid() {
        return cxid;
    }

    public void setCxid(Integer cxid) {
        this.cxid = cxid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getPaifang() {
        return paifang;
    }

    public void setPaifang(String paifang) {
        this.paifang = paifang == null ? null : paifang.trim();
    }

    public Integer getLichengRight() {
        return lichengRight;
    }

    public void setLichengRight(Integer lichengRight) {
        this.lichengRight = lichengRight;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getLichengLeft() {
        return lichengLeft;
    }

    public void setLichengLeft(Integer lichengLeft) {
        this.lichengLeft = lichengLeft;
    }
}