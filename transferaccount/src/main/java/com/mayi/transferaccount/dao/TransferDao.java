package com.mayi.transferaccount.dao;

import com.mayi.transferaccount.model.Transfer;
import org.springframework.stereotype.Repository;

import java.util.Hashtable;
import java.util.Map;

@Repository
public class TransferDao {

    public static Map<String, Transfer> transferMap = new Hashtable();

    public Transfer create(Transfer transfer) {
        synchronized (this){
            if (transferMap.get(transfer.getOrderNo()) != null){
                throw new RuntimeException("交易已存在");
            }
            transferMap.put(transfer.getOrderNo(), transfer);
            return transfer;
        }
    }

    public Transfer update(Transfer transfer) {
        transferMap.put(transfer.getOrderNo(), transfer);
        return transfer;
    }

    public Transfer load(String orderNo) {
        return transferMap.get(orderNo);
    }
}
