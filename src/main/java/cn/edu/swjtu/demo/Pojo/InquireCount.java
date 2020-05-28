package cn.edu.swjtu.demo.Pojo;

public class InquireCount {
    private String cookieid;

    private Long pid;

    private String location;

    private Long inquireCount;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Long getInquireCount() {
        return inquireCount;
    }

    public void setInquireCount(Long inquireCount) {
        this.inquireCount = inquireCount;
    }
}