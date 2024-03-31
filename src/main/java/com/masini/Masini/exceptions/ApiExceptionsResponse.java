package com.masini.Masini.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@JsonIgnoreProperties(value={"stackTrace","suppressed","cause","localizedMessage"})
public class ApiExceptionsResponse extends Exception{

    private final HttpStatus status;
    private final List<String> errors;

    @Builder
    public ApiExceptionsResponse(String message, HttpStatus status, List<String> errors) {
        super(message);
        this.status = status;
        this.errors = errors;
    }
}
