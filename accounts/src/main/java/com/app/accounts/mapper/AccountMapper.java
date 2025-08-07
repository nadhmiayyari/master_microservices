package com.app.accounts.mapper;

import com.app.accounts.dto.AccountsDto;
import com.app.accounts.entity.Account;

public class AccountMapper {


    public static AccountsDto toAccountsDto(Account account,AccountsDto accountsDto) {
        accountsDto.setAccountNumber(account.getAccountNumber());
        accountsDto.setAccountType(account.getAccountType());
        accountsDto.setBranchAddress(account.getBranchAddress());
        return accountsDto;
    }

    public static Account toAccount(Account account,AccountsDto accountsDto) {
        account.setAccountNumber(accountsDto.getAccountNumber());
        account.setAccountType(accountsDto.getAccountType());
        account.setBranchAddress(accountsDto.getBranchAddress());
        return account;
    }


}
