package cn.edu.swjtu.demo.Pojo;

public class CarBusiness {
    private Integer sid;

    private String uname;

    private String sname;

    private Double haoping;

    private String dizhi;

    private String tel;

    private String huiyuan;

    private Integer zaishou;

    private Integer yishou;

    private String describe;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Double getHaoping() {
        return haoping;
    }

    public void setHaoping(Double haoping) {
        this.haoping = haoping;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getHuiyuan() {
        return huiyuan;
    }

    public void setHuiyuan(String huiyuan) {
        this.huiyuan = huiyuan == null ? null : huiyuan.trim();
    }

    public Integer getZaishou() {
        return zaishou;
    }

    public void setZaishou(Integer zaishou) {
        this.zaishou = zaishou;
    }

    public Integer getYishou() {
        return yishou;
    }

    public void setYishou(Integer yishou) {
        this.yishou = yishou;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}