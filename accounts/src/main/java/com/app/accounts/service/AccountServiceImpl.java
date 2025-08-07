package com.app.accounts.service;

import com.app.accounts.dto.CustomerDto;
import com.app.accounts.entity.Customer;
import com.app.accounts.mapper.CustomerMapper;
import com.app.accounts.repository.AccountRepository;
import com.app.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.toCustomer( new Customer(),customerDto);

    }
}
