/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Quartier;
import bean.StoreOwner;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ouss
 */
@Stateless
public class QuartierFacade extends AbstractFacade<Quartier> {

    @PersistenceContext(unitName = "Food_DeliveryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuartierFacade() {
        super(Quartier.class);
    }

    public List<Quartier> findByByStoreOwner(StoreOwner storeOwner) {
        System.out.println("haaa sotoreOwner => " + storeOwner);
        List<Quartier> res = em.createQuery("SELECT q FROM Quartier q WHERE q.ville.nom ='" + storeOwner.getVille() + "'").getResultList();
        System.out.println("haaa res ==> " + res);
        return res;
    }

}
