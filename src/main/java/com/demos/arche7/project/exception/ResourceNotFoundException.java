package com.demos.arche7.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends  RuntimeException {
    /**
     *
     * @param message cette exception gère les messages d'erreur dans le controller
     */
    public ResourceNotFoundException(String message){
        super(message);
    }
}
