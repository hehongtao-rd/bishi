package com.mayi.transferaccount.service;

import com.mayi.transferaccount.model.Transfer;
import com.mayi.transferaccount.dto.TransferRequestParamDTO;

public interface TransferService {

    /**
     * 转账接口
     *
     * @param paramDTO 转账请求参数
     * @return Transfer
     */
    Transfer transfer(TransferRequestParamDTO paramDTO);
}
