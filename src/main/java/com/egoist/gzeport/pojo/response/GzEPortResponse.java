package com.egoist.gzeport.pojo.response;

/**
 * 回复
 */
public class GzEPortResponse extends Response {
    /**
     * 结果描述
     */
    private String description;

    /**
     * 失败返回结果代码
     */
    private String errorCode;

    /**
     * 成功、失败
     */
    private Boolean result;

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * @param result result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

}
