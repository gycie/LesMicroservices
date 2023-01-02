package sn.groupeisi.Enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Data

public class AppRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, length = 100, nullable = false)
    private String nom;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppUser> appUserEntities = new ArrayList<AppUser>();

    public AppRoles() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<AppUser> getAppUserEntities() {
        return appUserEntities;
    }

    public void setAppUserEntities(List<AppUser> appUserEntities) {
        this.appUserEntities = appUserEntities;
    }
}
