package io.github.doenisf.comlink4j.exception;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private String code;
    private String message;
}