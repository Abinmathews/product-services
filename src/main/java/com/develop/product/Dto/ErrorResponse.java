package com.develop.product.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponse {

    private long statusCode;
    private String message;

    public ErrorResponse(long statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
