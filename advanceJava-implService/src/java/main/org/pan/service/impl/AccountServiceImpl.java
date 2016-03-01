package org.pan.service.impl;

import org.pan.domain.Account;
import org.pan.service.AccountService;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * Created by Administrator on 2016/2/29.
 */
public class AccountServiceImpl extends AbstractService implements AccountService {

    public Account getById(Long id) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            return entityManager.find(Account.class, id);
        } finally {
            entityManager.close();
        }
    }

    public boolean login(String username, String password) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            TypedQuery<Long> query = entityManager.createQuery("select count(a.id) from Account a where a.username = ?1 and a.password = ?2", Long.class);
            query.setParameter(1, username);
            query.setParameter(2, password);
            Long singleResult = query.getSingleResult();
            return singleResult.longValue() > 0;
        } finally {
            entityManager.close();
        }
    }

    public Long saveAccount(Account account) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            if (account.getId() == null) {
                entityManager.persist(account);
            }else {
                entityManager.merge(account);
            }
            entityManager.getTransaction().commit();
            return account.getId();
        } finally {
            entityManager.close();
        }
    }

}
