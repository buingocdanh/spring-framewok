package com.buingocdanh.demo.app.ws.io.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Field: Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * Field: name
	 */
	@Column(name = "name", length = 50, nullable = false, unique = false)
	private String name;

	/**
	 * Field: email
	 */
	@Column(name = "email", length = 50, nullable = false, unique = false)
	private String email;

	/**
	 * Field: password
	 * */
	@Column(name = "password", length = 50, nullable = false, unique = false)
	private String password;
	
	/**
	 * Field: status
	 * 
	 * */
	@Column(name = "status", length = 11, nullable = false, unique = false)
	private Boolean status;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
}