package com.pityke17.exception;

import java.util.Map;

public record ErrorResponse (
        Map<String, String> errors
){
}
