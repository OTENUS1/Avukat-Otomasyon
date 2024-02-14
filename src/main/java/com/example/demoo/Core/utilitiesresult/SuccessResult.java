package com.example.demoo.Core.utilitiesresult;

public class SuccessResult extends Result{
    public SuccessResult(){
        super(true);
    }
    public SuccessResult(String massage){
        super(true,massage);
    }
}
