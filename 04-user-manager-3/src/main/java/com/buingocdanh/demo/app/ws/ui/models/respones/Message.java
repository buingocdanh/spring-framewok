package com.buingocdanh.demo.app.ws.ui.models.respones;

import java.util.Date;

public class Message {
	private Date time;
	private String message;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(Date time, String message) {
		super();
		this.time = time;
		this.message = message;
	}

}
