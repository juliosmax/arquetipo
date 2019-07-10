/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mineco.service;

import gt.gob.mineco.dao.DaoRepo;
import gt.gob.mineco.model.Departamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

/**
 *
 * @author julio
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class DiacoSrvImpl implements DiacoSrv {
    
     @Inject
    private DaoRepo dao;
    
    @Override
    public List<Departamento> getDepartamentos()
    {
        return getDao().findAllDepartamentos();
    }

    /**
     * @return the dao
     */
    public DaoRepo getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(DaoRepo dao) {
        this.dao = dao;
    }
}
