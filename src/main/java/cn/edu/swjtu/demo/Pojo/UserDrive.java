package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class UserDrive {
    private Long recordId;

    private Date time;

    private String cookieid;

    private Long pid;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCookieid() {
        return cookieid;
    }

    public void setCookieid(String cookieid) {
        this.cookieid = cookieid == null ? null : cookieid.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}