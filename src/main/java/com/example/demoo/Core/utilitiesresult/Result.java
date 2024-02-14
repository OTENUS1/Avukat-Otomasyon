package com.example.demoo.Core.utilitiesresult;

import lombok.Getter;

@Getter
public class Result {
    @Getter
    private boolean success;
    private  String message;

    public Result(boolean success){
        this.success=success;
    }
    public Result(boolean success,String message){
        this.success=success;
        this.message=message;
    }
}
