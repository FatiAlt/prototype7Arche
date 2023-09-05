package com.demos.arche7.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**@Deprecated
 * @param classe qui génère un message dans les classes stock et adresse
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends  RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
