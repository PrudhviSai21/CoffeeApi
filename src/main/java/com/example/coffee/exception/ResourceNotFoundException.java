package com.example.coffee.exception;

public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    String fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String type) {
        super(String.format("%s not found with %s :%s",resourceName,fieldName,type));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = type;
    }


}
