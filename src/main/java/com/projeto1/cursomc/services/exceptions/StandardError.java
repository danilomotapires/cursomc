package com.projeto1.cursomc.services.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private Long tiemStamp;
	
	public StandardError(Integer status, String msg, Long tiemStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.tiemStamp = tiemStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTiemStamp() {
		return tiemStamp;
	}

	public void setTiemStamp(Long tiemStamp) {
		this.tiemStamp = tiemStamp;
	}
	
	
}
