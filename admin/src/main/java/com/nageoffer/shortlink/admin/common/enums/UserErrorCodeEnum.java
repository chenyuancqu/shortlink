package com.nageoffer.shortlink.admin.common.enums;

import com.nageoffer.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * Date: 2024/7/18
 * Author: chenyuan
 * E-mail: yuan_chen24@163.com
 * Description:
 */
public enum UserErrorCodeEnum implements IErrorCode {

    USER_NOT_EXIST("B000200", "用户记录不存在");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
