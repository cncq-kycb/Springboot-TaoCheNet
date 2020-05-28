package cn.edu.swjtu.demo.Pojo;

public class UserInfo extends UserInfoKey {
	private String password;

	private String name;

	private String age;

	private String tel;

	private String location;

	private Long userTypeId;

	private Long userPermissionId;

	private Integer infoPermission;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public Long getUserPermissionId() {
		return userPermissionId;
	}

	public void setUserPermissionId(Long userPermissionId) {
		this.userPermissionId = userPermissionId;
	}

	public Integer getInfoPermission() {
		return infoPermission;
	}

	public void setInfoPermission(Integer infoPermission) {
		this.infoPermission = infoPermission;
	}
}