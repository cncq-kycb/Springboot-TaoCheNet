package cn.edu.swjtu.demo.Pojo;

public class CarPicture {
    private Integer picid;

    private Integer pid;

    private String type;

    private String src;

    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}