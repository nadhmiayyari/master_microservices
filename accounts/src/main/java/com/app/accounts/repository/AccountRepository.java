package com.app.accounts.repository;

import com.app.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface AccountRepository extends JpaRepository<Account, Long> {
}
