package io.github.doenisf.comlink4j.exception;

import lombok.Getter;
import lombok.ToString;
import okhttp3.Response;

@Getter
public class ApiException extends Exception {
    private final Response apiResponse;

    public ApiException(Response apiResponse) {
        this.apiResponse = apiResponse;
    }

    public ApiException(String message, Response apiResponse) {
        super(message);
        this.apiResponse = apiResponse;
    }

    public ApiException(String message, Throwable cause, Response apiResponse) {
        super(message, cause);
        this.apiResponse = apiResponse;
    }

    public ApiException(Throwable cause, Response apiResponse) {
        super(cause);
        this.apiResponse = apiResponse;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "message=" + this.getMessage() + ',' +
                "apiResponse=" + apiResponse +
                '}';
    }
}
