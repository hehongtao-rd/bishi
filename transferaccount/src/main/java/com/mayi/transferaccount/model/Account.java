package com.mayi.transferaccount.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class Account implements Serializable {
    private static final long serialVersionUID = 1913526216813672031L;


    /**
     * 数据库自增id
     * */
    private Long id;

    /**
     * 账号
     */
    private String accountNo;

    /**
     * 可用金额
     */
    private BigDecimal availableAmount;

    /**
     * 账户创建时间
     * */
    private Long timeCreated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Account(String accountNo, BigDecimal rechargeAmount) {
        this.accountNo = accountNo;
        this.availableAmount = rechargeAmount;
        this.timeCreated = System.currentTimeMillis();
    }

    public Account() {

    }
}