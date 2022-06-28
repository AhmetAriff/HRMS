package com.example.hrms.core.Utilities.Results;

public class SuccesDataResult<T> extends DataResult<T>{

    public SuccesDataResult(T data,String message)
    {
        super(data,true,message);
    }

    public SuccesDataResult(T data)
    {
        super(data,true);
    }
}
