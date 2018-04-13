package com.bailu.mybatis.model.basic;

/**
 * @Author mabailu
 * @Date 2018/4/13 17:13
 * @Description
 */
public class SysUserRole {
    private Long userId;

    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
