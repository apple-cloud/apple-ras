//package com.appleframework.ras.token;
//
//import com.gitee.easyopen.auth.OpenUser;
//
//public class TokenUser implements OpenUser {
//
//	private static final long serialVersionUID = 1L;
//	
//	private Long id;
//	private String nickName;
//	
//	private String openid;
//	private String sessionKey;
//
//	@Override
//	public String getUsername() {
//		return String.valueOf(nickName);
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getNickName() {
//		return nickName;
//	}
//
//	public void setNickName(String nickName) {
//		this.nickName = nickName;
//	}
//
//	public TokenUser() {
//
//	}
//
//	public TokenUser(Long id, String nickName) {
//		super();
//		this.id = id;
//		this.nickName = nickName;
//	}
//
//	public TokenUser(Long id, String nickName, String openid, String sessionKey) {
//		super();
//		this.id = id;
//		this.nickName = nickName;
//		this.openid = openid;
//		this.sessionKey = sessionKey;
//	}
//
//	public String getOpenid() {
//		return openid;
//	}
//
//	public void setOpenid(String openid) {
//		this.openid = openid;
//	}
//
//	public String getSessionKey() {
//		return sessionKey;
//	}
//
//	public void setSessionKey(String sessionKey) {
//		this.sessionKey = sessionKey;
//	}
//
//}
