package com.dhcc.ecm.WANO.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @ClassName BusinessProperties
 * @Description 配置文件模型类
 * @author wangaobing wangaobing001@dhcc.com.cn
 * @date 2016-07-08
 */
@ConfigurationProperties(prefix = "WANO",locations = "classpath:/WANO.properties")
public class WANOProperties {
	private String ldapSearch;
	private String userNameById;
	private String erjinzhiUrl;
	private String masterServiceUrl;
	private String userAuthorTree;
	private String orgMessage;
	private String usersForDeptAndRole;
	private String rolesByUser;
	private String commonFirstNav;
	private String commonOtherNav;
	private String treeAuth;
	private String createDocumentinstence;
	private String filePathIma;
	private String sendMessage;
	private String filePath;
	private String systemId;
	private String personMessage;
	private String webUrl;
	private String personMessage1;


	public String getPersonMessage1() {
		return personMessage1;
	}

	public void setPersonMessage1(String personMessage1) {
		this.personMessage1 = personMessage1;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getPersonMessage() {
		return personMessage;
	}

	public void setPersonMessage(String personMessage) {
		this.personMessage = personMessage;
	}

	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getFilePath() {
		return filePath;
	}
	public String getLdapSearch() {
		return ldapSearch;
	}
	public void setLdapSearch(String ldapSearch) {
		this.ldapSearch = ldapSearch;
	}
	public String getErjinzhiUrl() {
		return erjinzhiUrl;
	}
	public void setErjinzhiUrl(String erjinzhiUrl) {
		this.erjinzhiUrl = erjinzhiUrl;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getMasterServiceUrl() {
		return masterServiceUrl;
	}
	public void setMasterServiceUrl(String masterServiceUrl) {
		this.masterServiceUrl = masterServiceUrl;
	}
	public String getUserAuthorTree() {
		return userAuthorTree;
	}
	public void setUserAuthorTree(String userAuthorTree) {
		this.userAuthorTree = userAuthorTree;
	}

	public String getUserNameById() {
		return userNameById;
	}

	public void setUserNameById(String userNameById) {
		this.userNameById = userNameById;
	}

	public String getOrgMessage() {
		return orgMessage;
	}

	public void setOrgMessage(String orgMessage) {
		this.orgMessage = orgMessage;
	}

	public String getUsersForDeptAndRole() {
		return usersForDeptAndRole;
	}

	public void setUsersForDeptAndRole(String usersForDeptAndRole) {
		this.usersForDeptAndRole = usersForDeptAndRole;
	}

	public String getRolesByUser() {
		return rolesByUser;
	}

	public void setRolesByUser(String rolesByUser) {
		this.rolesByUser = rolesByUser;
	}

	public String getCommonFirstNav() {
		return commonFirstNav;
	}

	public void setCommonFirstNav(String commonFirstNav) {
		this.commonFirstNav = commonFirstNav;
	}

	public String getCommonOtherNav() {
		return commonOtherNav;
	}

	public void setCommonOtherNav(String commonOtherNav) {
		this.commonOtherNav = commonOtherNav;
	}

	public String getTreeAuth() {
		return treeAuth;
	}

	public void setTreeAuth(String treeAuth) {
		this.treeAuth = treeAuth;
	}

	public String getCreateDocumentinstence() {
		return createDocumentinstence;
	}

	public void setCreateDocumentinstence(String createDocumentinstence) {
		this.createDocumentinstence = createDocumentinstence;
	}

	public String getFilePathIma() {
		return filePathIma;
	}

	public void setFilePathIma(String filePathIma) {
		this.filePathIma = filePathIma;
	}

	public String getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}}
