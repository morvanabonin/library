/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.User;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Model class of User
 * @author morvanabonin
 */
public class UserBD extends CrudGenericoBD<User> {

    @Override
    public List<User> pesquisar(String valor) {
        EntityManager em = createEntityManager();
        try {
            Query query = em.createNamedQuery("User.findByUser");
            query.setParameter("name", "%" + valor + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<User> pesquisar(User bean) {
        return pesquisar(bean.getName());
    }


    
}