package com.example.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String msg;
	private Long timestamp;
	
	public StandardError(Integer id, String msg, Long timestamp) {
		super();
		this.id = id;
		this.msg = msg;
		this.timestamp = timestamp;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
