package com.mayi.transferaccount.controller;

import com.mayi.transferaccount.response.ResultBody;
import com.mayi.transferaccount.model.Account;
import com.mayi.transferaccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/service")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @ResponseBody
    @RequestMapping(value = "/v1/accounts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResultBody listAccount() {
        List<Account> accounts = accountService.listAccount();
        return new ResultBody<>(accounts);
    }
}
