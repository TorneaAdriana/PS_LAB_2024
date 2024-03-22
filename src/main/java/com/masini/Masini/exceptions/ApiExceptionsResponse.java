package com.masini.Masini.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(value={"stackTrace","suppressed","cause","localizedMessage"})
public class ApiExceptionsResponse extends Exception{

    private final Exception exception;
    private final List<String> errors;

    @Builder
    public ApiExceptionsResponse(String message, Exception exception, List<String> errors) {
        super(message);
        this.exception = exception;
        this.errors = errors;
    }
}
