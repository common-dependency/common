package com.github.common;

import com.github.common.enums.ResultCodeEnum;

public class Result<T> {
	
	private T data;
	
	private String message;
	
	private Integer code;
	
	public static <T> Result<T> of(T data, String msg, Integer code) {
		
		return new Result<>(data, msg, code);
	} 
	

	public static <T> Result<T> of(T data, ResultCodeEnum stateCodeEnum) {
		
		return new Result<>(data, stateCodeEnum.getMessage(), stateCodeEnum.getCode());
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public Result(T data, String message, Integer code) {
		super();
		this.data = data;
		this.message = message;
		this.code = code;
	} 
	
	
	
	
	

}
