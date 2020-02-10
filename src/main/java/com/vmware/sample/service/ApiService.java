package com.vmware.sample.service;

import com.vmware.sample.utils.Response;
import com.vmware.sample.utils.StatusCode;
import org.springframework.stereotype.Component;

@Component
public class ApiService {

    private Response setResult(StatusCode resultEnum, Object data) {
        return new Response(resultEnum.getCode(), resultEnum.getMessage(), data);
    }

    private Response setResult(Integer code, String message, Object data) {
        return new Response(code, message, data);
    }

    public Response setResultError() {
        return setResult(StatusCode.ERROR, null);
    }

    public Response setResultError(String message) {
        return setResult(500, message, null);
    }

    public Response setResultSuccess() {
        return setResult(StatusCode.SUCCESS, null);
    }

    public Response setResultSuccess(Object data) {
        return setResult(StatusCode.SUCCESS, data);
    }
}
