package com.vmware.sample.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Response")
public class Response {

    @ApiModelProperty(value = "status code", required = true)
    private Integer code;

    @ApiModelProperty(value = "prompt info", required = false)
    private String message;

    @ApiModelProperty(value = "return data", required = false)
    private Object data;

    public Response() {}
    public Response(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
