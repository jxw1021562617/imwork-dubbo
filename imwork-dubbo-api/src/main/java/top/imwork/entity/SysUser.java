package top.imwork.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String userName;

    private String userNameSpell;

    private String userAddress;

    private String userDesc;

    private String userEmail;

    private String userMobilPhone;

    private Integer userType;

    private Integer userStatus;

    private String userIdCard;

    private String userAvatar;

    private String salt;

    private Integer dncnet;

    private Integer orgTreeId;

    private String orgTreeName;

    private Integer areaId;

    private String employeeId;

    private String loginName;

    private String loginPassword;

    private Integer errorTimes;

    private Integer loginerrorTimes;

    private Integer sorts;

    private String isDifferentIpLogin;

    private Date lastLoginTime;

    private Date createTime;

    private Date lastModified;

    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNameSpell() {
        return userNameSpell;
    }

    public void setUserNameSpell(String userNameSpell) {
        this.userNameSpell = userNameSpell == null ? null : userNameSpell.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserMobilPhone() {
        return userMobilPhone;
    }

    public void setUserMobilPhone(String userMobilPhone) {
        this.userMobilPhone = userMobilPhone == null ? null : userMobilPhone.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getDncnet() {
        return dncnet;
    }

    public void setDncnet(Integer dncnet) {
        this.dncnet = dncnet;
    }

    public Integer getOrgTreeId() {
        return orgTreeId;
    }

    public void setOrgTreeId(Integer orgTreeId) {
        this.orgTreeId = orgTreeId;
    }

    public String getOrgTreeName() {
        return orgTreeName;
    }

    public void setOrgTreeName(String orgTreeName) {
        this.orgTreeName = orgTreeName == null ? null : orgTreeName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Integer getErrorTimes() {
        return errorTimes;
    }

    public void setErrorTimes(Integer errorTimes) {
        this.errorTimes = errorTimes;
    }

    public Integer getLoginerrorTimes() {
        return loginerrorTimes;
    }

    public void setLoginerrorTimes(Integer loginerrorTimes) {
        this.loginerrorTimes = loginerrorTimes;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public String getIsDifferentIpLogin() {
        return isDifferentIpLogin;
    }

    public void setIsDifferentIpLogin(String isDifferentIpLogin) {
        this.isDifferentIpLogin = isDifferentIpLogin == null ? null : isDifferentIpLogin.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}