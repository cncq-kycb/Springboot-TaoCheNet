package cn.edu.swjtu.demo.Pojo;

import java.util.Date;

public class DriveCount {
	private String cookieid;

	private String tel;

	private String age;

	private Integer infoPermission;

	private String location;

	private Long pid;

	private Date time;

	public String getCookieid() {
		return cookieid;
	}

	public void setCookieid(String cookieid) {
		this.cookieid = cookieid == null ? null : cookieid.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getInfoPermission() {
		return infoPermission;
	}

	public void setInfoPermission(Integer infoPermission) {
		this.infoPermission = infoPermission;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}