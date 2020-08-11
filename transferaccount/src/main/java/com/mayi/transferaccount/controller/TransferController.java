package com.mayi.transferaccount.controller;


import com.mayi.transferaccount.dto.TransferRequestParamDTO;
import com.mayi.transferaccount.model.Transfer;
import com.mayi.transferaccount.response.ResultBody;
import com.mayi.transferaccount.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/service")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @ResponseBody
    @RequestMapping(value = "/v1/transfer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResultBody transfer(@RequestBody TransferRequestParamDTO transferParamDTO) {
        Transfer transfer = transferService.transfer(transferParamDTO);
        return new ResultBody(transfer);
    }

}
