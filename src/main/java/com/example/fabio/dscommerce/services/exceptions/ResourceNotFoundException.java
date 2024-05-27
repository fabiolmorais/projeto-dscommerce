package com.example.fabio.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (String msg) {
        super(msg);
    }
}
