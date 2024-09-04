package com.lcwd.electronic.store.exceptions;

import lombok.Builder;
//Custom Exception
@Builder
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super("Resource not found !!");

    }
    public ResourceNotFoundException(String message){
        super(message);
    }

}
