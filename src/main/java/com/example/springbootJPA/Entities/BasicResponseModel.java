package com.example.springbootJPA.Entities;

public class BasicResponseModel {

    private int errorCode;
    private String messageCode;
    private Object objectResponse;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BasicResponseModel(int errorCode, String messageCode) {
        this.errorCode = errorCode;
        this.messageCode = messageCode;
    }

    public BasicResponseModel(Object objectResponse) {
        this.objectResponse = objectResponse;
    }

    public  BasicResponseModel(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public Object getObjectResponse() {
        return objectResponse;
    }

    public void setObjectResponse(Object objectResponse) {
        this.objectResponse = objectResponse;
    }
}
