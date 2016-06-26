/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.rn;

import com.senac.allura.bd.AuthorBD;
import com.senac.allura.bean.Author;
import com.senac.allura.crud.CrudGenericoRN;
import java.util.List;

/**
 *
 * @author morvanabonin
 */
public class AuthorRN extends CrudGenericoRN<Author> {
    
    private final AuthorBD crudBD;

    public AuthorRN() {
        crudBD = new AuthorBD();
    }

    @Override
    public Author consultar(Author bean) {
        return null;
    }

    @Override
    public boolean excluir(Author bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author salvar(Author bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author alterar(Author bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> pesquisar(Author bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> pesquisar(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
