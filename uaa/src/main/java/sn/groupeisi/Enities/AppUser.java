package sn.groupeisi.Enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 80, nullable = false)
    private String nom;
    @Column(length = 100, nullable = false)
    private String prenom;
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    @Column(length = 150, nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppRoles> appRoleEntities = new ArrayList<AppRoles>();
}
