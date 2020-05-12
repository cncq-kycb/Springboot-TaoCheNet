package cn.edu.swjtu.demo.Pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionView {
    private Long recordId;

    private Long pid;

    private BigDecimal price;

    private Date recordTime;

    private String userCookieid;

    private String businessCookieid;

    private Integer transactionType;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getUserCookieid() {
        return userCookieid;
    }

    public void setUserCookieid(String userCookieid) {
        this.userCookieid = userCookieid == null ? null : userCookieid.trim();
    }

    public String getBusinessCookieid() {
        return businessCookieid;
    }

    public void setBusinessCookieid(String businessCookieid) {
        this.businessCookieid = businessCookieid == null ? null : businessCookieid.trim();
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }
}