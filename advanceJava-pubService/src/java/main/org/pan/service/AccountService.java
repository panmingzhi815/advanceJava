package org.pan.service;

import org.pan.domain.Account;

/**
 * Created by Administrator on 2016/2/29.
 */
public interface AccountService {

    Account getById(Long id);

    boolean login(String username, String password);

    Long saveAccount(Account account);
}
