/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mineco.dao;

import gt.gob.mineco.model.Departamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@ApplicationScoped
public class DaoRepo {

	@PersistenceContext
        //private EntityManagerFactory emf;
	private EntityManager em;

/**
 *
 * @author julio
 */
  public List<Departamento> findAllDepartamentos() {
	return em.createNamedQuery("Departamento.findAll").getResultList();
	}
        
  
   //em set, get
        public EntityManager getEm() {
            return em;
        }

        public void setEm(EntityManager em) {
            this.em = em;
        }
    
}
