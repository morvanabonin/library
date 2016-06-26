/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.User;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;

/**
 * Model class of User
 * @author morvanabonin
 */
public class UserBD extends CrudGenericoBD<User> {

    @Override
    public List<User> pesquisar(User bean) {
        return null;
    }

    @Override
    public List<User> pesquisar(String valor) {
        return null;
    }
    
}