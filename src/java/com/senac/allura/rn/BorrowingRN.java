/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.rn;

import com.senac.allura.bd.BorrowingBD;
import com.senac.allura.bean.Borrowing;
import com.senac.allura.crud.CrudGenericoRN;
import java.util.List;

/**
 *
 * @author morvanabonin
 */
public class BorrowingRN extends CrudGenericoRN<Borrowing> {
    
    private final BorrowingBD crudBD;

    public BorrowingRN() {
        crudBD = new BorrowingBD();
    }

    @Override
    public Borrowing consultar(Borrowing bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Borrowing bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Borrowing salvar(Borrowing bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Borrowing alterar(Borrowing bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Borrowing> pesquisar(Borrowing bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Borrowing> pesquisar(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
