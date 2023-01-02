package sn.groupeisi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppUser {
    private int id;
    @NotNull(value  = "le nom ne doit pas etre null")
    private String nom;
    @NotNull(value = "le prenom ne doit pas etre null")
    private String prenom;
    @NotNull(value = "l'email ne doit pas etre null")
    private String email;
    @NotNull(value = "le mot de passe ne doit pas etre null")
    private String password;
}
