package com.tiago.loja.testes;

import com.tiago.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto telefone = new Produto();
        telefone.setNome("Iphone 12 Pro");
        telefone.setDescricao("Smartphone");
        telefone.setPreco(new BigDecimal(850));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja_1");

        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(telefone);
        em.getTransaction().commit();
        em.close();
    }
}
