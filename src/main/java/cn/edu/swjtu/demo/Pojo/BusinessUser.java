package cn.edu.swjtu.demo.Pojo;

public class BusinessUser {
    private String cookieid;

    private Integer sid;

    public String getCookieid() {
        return cookieid;
    }

    public void setCookieid(String cookieid) {
        this.cookieid = cookieid == null ? null : cookieid.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}