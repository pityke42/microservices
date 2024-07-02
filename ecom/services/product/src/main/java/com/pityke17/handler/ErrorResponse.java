package com.pityke17.handler;

import java.util.Map;

public record ErrorResponse (
        Map<String, String> errors
){
}
