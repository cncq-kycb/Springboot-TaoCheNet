package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class RecommenderList {
    private String id;

    private String cookieid;

    private Date createTime;

    private String recommenderPids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCookieid() {
        return cookieid;
    }

    public void setCookieid(String cookieid) {
        this.cookieid = cookieid == null ? null : cookieid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRecommenderPids() {
        return recommenderPids;
    }

    public void setRecommenderPids(String recommenderPids) {
        this.recommenderPids = recommenderPids == null ? null : recommenderPids.trim();
    }
}