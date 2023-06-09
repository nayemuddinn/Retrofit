package com.example.retrofit.Service.Model;

import java.util.List;

public class Result {

    private List<SportModel> Result;

    public Result() {
    }

    public Result(List<SportModel> result) {
        Result = result;
    }

    public List<SportModel> getResult() {
        return Result;
    }

    public void setResult(List<SportModel> result) {
        Result = result;
    }
}
