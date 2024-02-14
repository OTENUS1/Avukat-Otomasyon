package com.example.demoo.Core.utilitiesresult;

public class ErrorResult extends Result{
    public ErrorResult(){
        super(false);
    }
    public ErrorResult(String massage){
        super(false,massage);
    }
}
