/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.Book;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Model class of Book
 * @author morvanabonin
 */
public class BookBD extends CrudGenericoBD<Book> {

    @Override
    public List<Book> pesquisar(String valor) {
        EntityManager em = createEntityManager();        
        try {
            Query query = em.createNamedQuery("Book.findByBook");
            query.setParameter("title", "%" + valor + "%");
            return query.getResultList();
        } finally {
            em.close();        
        }
    }

    @Override
    public List<Book> pesquisar(Book bean) {
        return pesquisar(bean.getTitle());
    }

}