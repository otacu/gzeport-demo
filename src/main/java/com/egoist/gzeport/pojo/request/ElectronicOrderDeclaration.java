package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class ElectronicOrderDeclaration implements Serializable {

    /**
     * 电子订单请求头
     */
    @NotNull(message = "电子订单请求头不能为空")
    @XStreamAlias("OrderHead")
    private ElectronicOrderHead electronicOrderHead;

    /**
     * 电子订单数据集合
     */
    @NotNull(message = "电子订单数据集合")
    @XStreamAlias("OrderList")
    private List<ElectronicOrderContent> electronicOrderContentList;



    /**
     * @return electronicOrderHead
     */
    public ElectronicOrderHead getElectronicOrderHead() {
        return electronicOrderHead;
    }

    /**
     * @param electronicOrderHead electronicOrderHead
     */
    public void setElectronicOrderHead(ElectronicOrderHead electronicOrderHead) {
        this.electronicOrderHead = electronicOrderHead;
    }

    /**
     * @return electronicOrderContentList
     */
    public List<ElectronicOrderContent> getElectronicOrderContentList() {
        return electronicOrderContentList;
    }

    /**
     * @param electronicOrderContentList electronicOrderContentList
     */
    public void setElectronicOrderContentList(List<ElectronicOrderContent> electronicOrderContentList) {
        this.electronicOrderContentList = electronicOrderContentList;
    }
}
