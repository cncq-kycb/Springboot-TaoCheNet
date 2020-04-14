package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class RecommendBusiness {
    private String id;

    private String pid;

    private Date createTime;

    private String recommenderCookieids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRecommenderCookieids() {
        return recommenderCookieids;
    }

    public void setRecommenderCookieids(String recommenderCookieids) {
        this.recommenderCookieids = recommenderCookieids == null ? null : recommenderCookieids.trim();
    }
}