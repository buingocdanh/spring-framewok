package com.buingocdanh.demo.app.ws.ui.models.requests;


import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserRequest implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
    @Size(min=2,max=50, message = "name betwen from 2 to 50")
	private String name;
    @NotNull
	@Email
    private String email;
    @NotNull
    @Size(min=2,max=50,message = "pass betwen from 2 to 50")
    private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
