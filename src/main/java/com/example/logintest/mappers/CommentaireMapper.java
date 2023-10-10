package com.example.logintest.mappers;


import com.example.logintest.Dto.CommentaireDto;
import com.example.logintest.Entity.Commentaire;
import com.example.logintest.Entity.User;
import com.example.logintest.Repo.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface CommentaireMapper {

    @Autowired
    UserRepository userRepository = null;

    default String map(User user) {
        return user != null ? user.getId() : null;
    }

    default User map(String userId) {
        if (userId == null) {
            return null;
        }
        return userRepository.findById(userId).orElse(null);

    }
    @Mapping(source = "id", target = "id")
    @Mapping(source = "contenu", target = "contenu")
    @Mapping(source = "datePublication", target = "datePublication")
    @Mapping(source = "user", target = "userId")
    CommentaireDto commentaireToCommentaireDto(Commentaire commentaire);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "contenu", target = "contenu")
    @Mapping(source = "datePublication", target = "datePublication")
    @Mapping(source = "userId", target = "user")
    Commentaire commentaireDtoToCommentaire(CommentaireDto commentaireDto);
}

