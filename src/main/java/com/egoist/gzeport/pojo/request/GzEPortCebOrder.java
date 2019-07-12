package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.Serializable;
import java.util.List;

/**
 * 订单
 */
public class GzEPortCebOrder implements Serializable {

    /**
     * 电子订单表头
     */
    @XStreamAlias("OrderHead")
    private GzEPortCebOrderHead cebOrderHead;

    /**
     * 订单商品集合
     */
    @XStreamImplicit
    private List<GzEPortCebOrderGoods> cebOrderGoodsList;

    /**
     * @return cebOrderHead
     */
    public GzEPortCebOrderHead getCebOrderHead() {
        return cebOrderHead;
    }

    /**
     * @param cebOrderHead cebOrderHead
     */
    public void setCebOrderHead(GzEPortCebOrderHead cebOrderHead) {
        this.cebOrderHead = cebOrderHead;
    }

    /**
     * @return cebOrderGoodsList
     */
    public List<GzEPortCebOrderGoods> getCebOrderGoodsList() {
        return cebOrderGoodsList;
    }

    /**
     * @param cebOrderGoodsList cebOrderGoodsList
     */
    public void setCebOrderGoodsList(List<GzEPortCebOrderGoods> cebOrderGoodsList) {
        this.cebOrderGoodsList = cebOrderGoodsList;
    }
}
