package com.example.evableindia.layout;

public class RegfisterResponse
{

    String error;
    String message;

    public RegfisterResponse(String error, String message)
    {
        this.error = error;
        this.message = message;
    }

    public String getError()
    {
        return error;
    }

    public void setError
            (String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
