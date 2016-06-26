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

/**
 * Model class of Borrowing
 * @author morvanabonin
 */
public class BorrowingBD extends CrudGenericoBD<Borrowing> {
    
    @Override
    public List<Borrowing> pesquisar(Borrowing bean) {
        return null;
    }

    @Override
    public List<Borrowing> pesquisar(String valor) {
        return null;
    }
}
