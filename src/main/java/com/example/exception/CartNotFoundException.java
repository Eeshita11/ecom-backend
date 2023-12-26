package com.example.exception;

public class CartNotFoundException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public CartNotFoundException() 
    {

    }

    public CartNotFoundException(String s)
    {
        super(s);
    }
}


