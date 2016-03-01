package org.pan.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.pan.domain.Account;

/**
 * Created by xiaopan on 2016-03-01.
 */
public class AccountServiceImplTest extends AbstractServiceTest{
    @Test
    public void login(){
        Account account = new Account();
        account.setUsername("admin");
        account.setPassword("admin2");
        Long aLong = accountService.saveAccount(account);
        Assert.assertNotNull(aLong);

        Account byId = accountService.getById(aLong);
        Assert.assertEquals("admin",byId.getUsername());

        boolean login = accountService.login("admin", "admin2");
        Assert.assertEquals(true,login);
    }
}