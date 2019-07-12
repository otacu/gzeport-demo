package com.egoist.gzeport.pojo.response;

import java.util.List;

/**
 * 查询响应
 */
public class GzEPortQueryResponse extends GzEPortResponse {

    /**
     * 内容
     */
    private List<GzEPortQueryResponseContent> content;

    /**
     * @return content
     */
    public List<GzEPortQueryResponseContent> getContent() {
        return content;
    }

    /**
     * @param content content
     */
    public void setContent(List<GzEPortQueryResponseContent> content) {
        this.content = content;
    }
}
