package com.mayi.transferaccount.model;

import com.mayi.transferaccount.enums.TransferStatus;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
public class Transfer implements Serializable {
    private static final long serialVersionUID = -6548319329571430698L;

    /**
     * 交易单号
     * */
    private String orderNo;

    /**
     * 交易金额
     * */
    private BigDecimal amount;

    /**
     * 转入账号
     * */
    private String payeeAccount;

    /**
     * 转出账号
     * */
    private String payerAccount;

    /**
     * 转账状态
     * */
    private TransferStatus status;

    /**
     * 转账记录创建时间
     * */
    private Long timeCreated;

    /**
     * 转账成功时间
     * */
    private Long timeSuccess;

    /**
     * 转账失败信息
     * */
    private String failureMsg;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public TransferStatus getStatus() {
        return status;
    }

    public void setStatus(TransferStatus status) {
        this.status = status;
    }

    public Long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Long getTimeSuccess() {
        return timeSuccess;
    }

    public void setTimeSuccess(Long timeSuccess) {
        this.timeSuccess = timeSuccess;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }
}
