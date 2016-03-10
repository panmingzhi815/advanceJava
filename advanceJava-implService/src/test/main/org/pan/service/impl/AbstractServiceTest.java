package org.pan.service.impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by xiaopan on 2016-03-01.
 */
public class AbstractServiceTest {

    private static EntityManagerFactory newPersistenceUnit;
    protected static AccountServiceImpl accountService;

    @BeforeClass
    public static void setup(){
        newPersistenceUnit = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        accountService = new AccountServiceImpl();
        accountService.setEntityManagerFactory(newPersistenceUnit);
    }

    @AfterClass
    public static void destroy(){
        newPersistenceUnit.close();
    }

}
