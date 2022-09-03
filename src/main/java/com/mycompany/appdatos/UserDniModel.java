package com.mycompany.appdatos;

import java.util.Map;

public class UserDniModel {

    private boolean success;
    private String message;
    private Map<String, String> result;

    public UserDniModel() {

    }

    public UserDniModel(boolean success, String message, Map<String, String> result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }

}
