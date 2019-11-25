package com.buingocdanh.demo.app.ws.io.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * name
	 */
	@Column(name = "name", length = 50, nullable = false, unique = false)
	private String name;

	/**
	 * email
	 */
	@Column(name = "email", length = 50, nullable = false, unique = false)
	private String email;

	public UserEntity(int id, String name, String email) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.email=email;
	}

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter and Setter
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
