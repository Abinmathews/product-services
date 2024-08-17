package com.develop.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.develop.product.Dto.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleMyCustomException(ProductNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
