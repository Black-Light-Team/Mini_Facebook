package com.example.logintest.Dto;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString@Builder
@NoArgsConstructor
public class CommentaireDto {

    private String id;
    private String contenu;
    private Date datePublication;
    private String userId;

}
