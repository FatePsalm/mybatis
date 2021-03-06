package cn.dingd.dd.biz.common.entity;

import java.util.Date;

public class Role {
    private Integer id;

    private String roleName;

    private String roleDesc;

    private String status;

    private Date createTime;

    private Integer inlayObj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getInlayObj() {
        return inlayObj;
    }

    public void setInlayObj(Integer inlayObj) {
        this.inlayObj = inlayObj;
    }
}