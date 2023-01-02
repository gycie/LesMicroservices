package sn.groupeisi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class AppRoles {

    private int id;
    @NotNull(value  = "le nom ne doit pas etre null")
    private String nom;



}
