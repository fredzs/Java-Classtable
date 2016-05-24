package com.free4lab.classtable.model.dao;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="Student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "student_ID",unique=true,nullable=false)
	private int student_ID;
	private String student_name;
	private String identity;
	private String class_ID;
	private String email;
	private String telephone;
	/**
	 * @return the student_ID
	 */
	public int getStudent_ID() {
		return student_ID;
	}
	/**
	 * @param student_ID the student_ID to set
	 */
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}
	/**
	 * @param gender the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * @return the class_ID
	 */
	public String getClass_ID() {
		return class_ID;
	}
	/**
	 * @param class_ID the class_ID to set
	 */
	public void setClass_ID(String class_ID) {
		this.class_ID = class_ID;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}