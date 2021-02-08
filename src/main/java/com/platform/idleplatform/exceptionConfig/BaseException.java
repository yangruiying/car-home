package com.platform.idleplatform.exceptionConfig;

public class BaseException extends RuntimeException{
    private Integer code;
    private String errMsg;
    private static final long serialVersionUID = 6937304029901546157L;
    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
        this.code = -1;
        this.errMsg = message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
