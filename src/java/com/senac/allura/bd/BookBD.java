/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.bd;

import com.senac.allura.bean.Book;
import com.senac.allura.crud.CrudGenericoBD;
import java.util.List;

/**
 * 
 * @author morvanabonin
 */
public class BookBD extends CrudGenericoBD<Book> {

    @Override
    public List<Book> pesquisar(Book bean) {
        return null;
    }

    @Override
    public List<Book> pesquisar(String valor) {
        return null;
    }
    
}