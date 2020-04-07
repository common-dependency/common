package com.github.common.enums;


public enum ResultCodeEnum {
	
	SUCCESS(200, "SUCCESS"),//请求成功
	USERNAME_NOT_EXIST(401, "用户名不存在"),
	PASSWORD_NOT_CORRECT(401, "密码错误"),
	USERNAME_OR_PASSWORD_ERR(401, "用户名或密码错误"),
	ILLEGAL_TOKEN(401, "Illegal token"),//非法token
	OTHER_CLIENTS_LOGGED_IN(401, "Other clients logged in"),//其他终端登录
	TOKEN_EXPIRED(-2, "Token expired"),//token过期
	ERROR(-1, "ERROR");//请求失败
	
	private Integer code;
	
	private String message;

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	private ResultCodeEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	

}
