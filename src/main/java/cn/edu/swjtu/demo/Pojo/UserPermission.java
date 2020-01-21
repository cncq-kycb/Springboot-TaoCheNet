package cn.edu.swjtu.demo.Pojo;

public class UserPermission {
    private Long userPermissionId;

    private String userPermissionName;

    public Long getUserPermissionId() {
        return userPermissionId;
    }

    public void setUserPermissionId(Long userPermissionId) {
        this.userPermissionId = userPermissionId;
    }

    public String getUserPermissionName() {
        return userPermissionName;
    }

    public void setUserPermissionName(String userPermissionName) {
        this.userPermissionName = userPermissionName == null ? null : userPermissionName.trim();
    }
}