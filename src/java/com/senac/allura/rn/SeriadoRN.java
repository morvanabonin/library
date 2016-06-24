package com.senac.allura.rn;

import com.senac.allura.bd.SeriadoBD;
import com.senac.allura.bean.Seriado;
import com.senac.allura.crud.CrudGenericoRN;
import com.senac.allura.crud.RNException;
import java.util.List;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author lossurdo
 */
public class SeriadoRN extends CrudGenericoRN<Seriado> {
    private final SeriadoBD crudBD;

    public SeriadoRN() {
        crudBD = new SeriadoBD();
    }

    @Override
    public Seriado consultar(Seriado bean) {
        avaliarConsultar(crudBD, bean);
        return crudBD.consultar(bean);
    }

    @Override
    public boolean excluir(Seriado bean) {
        avaliarExcluir(crudBD, bean);
        return crudBD.excluir(bean);
    }

    @Override
    public Seriado salvar(Seriado bean) {
        avaliarSalvar(crudBD, bean);

        if(StringUtils.isBlank(bean.getTitulo())) {
            throw new RNException(RNException.Tipo.CAMPOS_OBRIGATORIOS_VIOLADOS);
        }
        
        return crudBD.salvar(bean);        
    }

    @Override
    public Seriado alterar(Seriado bean) {
        avaliarAlterar(crudBD, bean);

        if(StringUtils.isBlank(bean.getTitulo())) {
            throw new RNException(RNException.Tipo.CAMPOS_OBRIGATORIOS_VIOLADOS);
        }

        return crudBD.alterar(bean);
    }

    @Override
    public List<Seriado> pesquisar(Seriado bean) {
        return crudBD.pesquisar(bean);
    }

    @Override
    public List<Seriado> pesquisar(String valor) {
        valor = avaliarPesquisar(valor);
        return crudBD.pesquisar(valor);
    }
     
}
