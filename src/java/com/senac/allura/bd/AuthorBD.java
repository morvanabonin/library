/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.Author;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;

/**
 * Model class of Author
 * @author morvanabonin
 */
public class AuthorBD extends CrudGenericoBD<Author> {

    @Override
    public List<Author> pesquisar(Author bean) {
        return null;
    }

    @Override
    public List<Author> pesquisar(String valor) {
        return null;
    }
    
}
