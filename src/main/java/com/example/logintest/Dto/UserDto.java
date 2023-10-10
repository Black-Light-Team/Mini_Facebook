package com.example.logintest.Dto;

import com.example.logintest.Entity.Commentaire;
import com.example.logintest.Entity.Poste;
import com.example.logintest.Entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class UserDto {
    private String id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresseEmail;
    private String motDePasse;
    private Profile profile;
    private List<Commentaire> comments;
    private List<Poste> posts;

}
