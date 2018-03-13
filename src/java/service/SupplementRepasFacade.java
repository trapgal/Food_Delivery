/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.SupplementRepas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ouss
 */
@Stateless
public class SupplementRepasFacade extends AbstractFacade<SupplementRepas> {

    @PersistenceContext(unitName = "Food_DeliveryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupplementRepasFacade() {
        super(SupplementRepas.class);
    }
    
}
