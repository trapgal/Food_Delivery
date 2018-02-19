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

/**
 *
 * @author HP
 */
@Entity
public class Repas implements Serializable {

    @OneToMany(mappedBy = "repas")
    private List<SupplementRepas> supplementRepass;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private Double prix;
    @OneToMany
    private List<Restaurant> restaurants;
    @OneToMany
    private List<Supplement> supplemnts;
    @ManyToOne
    private TypeRepas typeRepas;
    @OneToMany(mappedBy = "repas")
    private List<IngredientRepas> ingredientRepass;
    @ManyToOne
    private NationaliteRepas nationaliteRepas;
    @OneToMany(mappedBy = "repas")
    private List<CommandeItem> commandeItems;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Repas)) {
            return false;
        }
        Repas other = (Repas) object;
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