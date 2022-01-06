package com.garben.web.entity;
import java.io.Serializable;

/**
 * @Description: 
 * @Date: Created inTue Jan 04 16:26:04 CST 2022
 * @Author: yaojiabin
 * @Modified By:
 */
public class User  implements Serializable {

	private static final long serialVersionUID =  6096747853030946043L;

	private Integer id;

	private String userName;

	private String passWord;

	private String realName;

	public User(){}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", realName='" + realName + '\'' +
				'}';
	}
}
