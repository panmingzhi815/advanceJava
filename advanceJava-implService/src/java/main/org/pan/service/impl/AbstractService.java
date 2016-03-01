package org.pan.service.impl;

import javax.persistence.EntityManagerFactory;

/**
 * Created by xiaopan on 2016-03-01.
 */
public class AbstractService {
    private EntityManagerFactory entityManagerFactory;

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
}
