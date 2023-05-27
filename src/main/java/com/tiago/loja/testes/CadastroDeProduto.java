package com.tiago.loja.testes;

import com.tiago.loja.dao.CategoriaDao;
import com.tiago.loja.dao.ProdutoDao;
import com.tiago.loja.modelo.Categoria;
import com.tiago.loja.modelo.Produto;
import com.tiago.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");

        Produto telefone = new Produto("Galaxy S20 Ultra", "Smartphone", new BigDecimal(990), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(telefone);

        em.getTransaction().commit();
        em.close();
    }
}
