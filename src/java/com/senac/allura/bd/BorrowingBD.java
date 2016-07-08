/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.Book;
import com.senac.allura.bean.Borrowing;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Model class of Borrowing
 * @author morvanabonin
 */
public class BorrowingBD extends CrudGenericoBD<Borrowing> {

    //@TO DO ajustar essa query
    @Override
    public List<Borrowing> pesquisar(String valor) {
        EntityManager em = createEntityManager();
        try {
            Query query = em.createNamedQuery("Borrowing.findByBorrowing");
            query.setParameter("", "%" + valor + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Borrowing> pesquisar(Borrowing bean) {
        return pesquisar(bean.getBook().getTitle());
    }
}
