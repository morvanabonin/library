/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.allura.rest;

import com.senac.allura.bean.Author;
import com.senac.allura.crud.CrudGenericoRest;
import com.senac.allura.rn.AuthorRN;
import java.util.List;
import javax.ws.rs.core.Response;

/**
 * Class AuthorRest
 * @author morvanabonin
 */
public class AuthorRest extends CrudGenericoRest<Author> {
    
    private final AuthorRN rn;

    public AuthorRest() {
        rn = new AuthorRN();
    }

    @Override
    public Response consultarPK(String pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response pesquisar(String q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response excluirPK(String pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response salvar(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response alterar(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Response gerarResponseParaCollection(List<Author> obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
