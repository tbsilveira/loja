package com.tiago.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("loja_1");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
