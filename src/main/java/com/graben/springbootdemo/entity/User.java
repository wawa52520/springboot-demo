package com.graben.springbootdemo.entity;
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

	private String username;

	private String password;

	private String realname;

	public User(){}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}
	
	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", realname='" + realname + '\'' +
				'}';
	}
}
