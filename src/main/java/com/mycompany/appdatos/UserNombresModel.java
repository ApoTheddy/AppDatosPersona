package com.mycompany.appdatos;

import java.util.List;
import java.util.Map;

public class UserNombresModel {

    private boolean success;
    private String message;
    private List<Map<String, Object>> result;

    public UserNombresModel() {

    }

    public UserNombresModel(boolean success, String message, List<Map<String, Object>> result) {
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

    public List<Map<String, Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String, Object>> result) {
        this.result = result;
    }

}
