package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class Recommend {
    private Integer recordId;

    private String cookieid;

    private String pids;

    private Date rtime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getCookieid() {
        return cookieid;
    }

    public void setCookieid(String cookieid) {
        this.cookieid = cookieid == null ? null : cookieid.trim();
    }

    public String getPid() {
        return pids;
    }

    public void setPid(String pids) {
        this.pids = pids;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }
}