package cn.edu.swjtu.demo.Pojo;

public class CarSeries {
    private Integer cxid;

    private String cxname;

    private Integer sortNum;

    private String describe;

    public Integer getCxid() {
        return cxid;
    }

    public void setCxid(Integer cxid) {
        this.cxid = cxid;
    }

    public String getCxname() {
        return cxname;
    }

    public void setCxname(String cxname) {
        this.cxname = cxname == null ? null : cxname.trim();
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}