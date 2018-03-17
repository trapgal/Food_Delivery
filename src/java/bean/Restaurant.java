/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author HP
 */
@Entity
public class Restaurant implements Serializable {

    @OneToMany(mappedBy = "restaurant")
    private List<Facture> factures;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String adresseResto;
    private String heureOuverture;
    private String heureFermeture;
    private String lat;
    private String lng;
//    @OneToMany
//    private List<Repas> repass;
    @ManyToOne
    private StoreOwner storeOwner;

    @ManyToOne
    private Quartier quartier;
    @OneToMany(mappedBy = "restaurant")
    private List<RepasResto> repasRestos;

    public Long getId() {
        return id;
    }

    public List<RepasResto> getRepasRestos() {
        return repasRestos;
    }

    public void setRepasRestos(List<RepasResto> repasRestos) {
        this.repasRestos = repasRestos;
    }
    

    public void setId(Long id) {
        this.id = id;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseResto() {
        return adresseResto;
    }

    public void setAdresseResto(String adresseResto) {
        this.adresseResto = adresseResto;
    }

    public String getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(String heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public String getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(String heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public StoreOwner getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(StoreOwner storeOwner) {
        this.storeOwner = storeOwner;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public Restaurant(List<Facture> factures, Long id, String nom, String adresseResto, String heureOuverture, String heureFermeture, String lat, String lng, List<Repas> repass, StoreOwner storeOwner, Quartier quartier) {
        this.factures = factures;
        this.id = id;
        this.nom = nom;
        this.adresseResto = adresseResto;
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
        this.lat = lat;
        this.lng = lng;
       
        this.storeOwner = storeOwner;
        this.quartier = quartier;
    }

    public Restaurant() {
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Client[ id=" + id + " ]";
    }

}
