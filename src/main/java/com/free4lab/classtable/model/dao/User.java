package com.free4lab.classtable.model.dao;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the class_table database table.
 * 
 */
@Entity
@Table(name="User")
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int user_ID;

	@Column(length=255)
	private String user_name;

	@Column(length=255)
	private String password;

	@Column(length=255)
	private String user_type;
	
	@Column(length=255)
	private int user_sign;
	

	public User(String user_name, String password, String user_type,int user_sign) 
	{
		// TODO Auto-generated constructor stub
		this.user_name = user_name;
		this.password = password;		
		this.user_type = user_type;
		this.user_sign = user_sign;
	}
	
	public User(int user_ID, String user_name, String password, String user_type,int user_sign) 
	{
		this.user_ID = user_ID;
		this.user_name = user_name;
		this.password = password;		
		this.user_type = user_type;
		this.user_sign = user_sign;
	}

	public User(){
	}

	/**
	 * @return the user_ID
	 */
	public int getUser_ID() {
		return user_ID;
	}

	/**
	 * @param user_ID the user_ID to set
	 */
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the user_type
	 */
	public String getUser_type() {
		return user_type;
	}

	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the user_sign
	 */
	public int getUser_sign() {
		return user_sign;
	}

	/**
	 * @param user_sign the user_sign to set
	 */
	public void setUser_sign(int user_sign) {
		this.user_sign = user_sign;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the id
	 */

}