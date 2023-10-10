package com.example.logintest.mappers;


import com.example.logintest.Dto.UserDto;
import com.example.logintest.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nom", target = "nom")
    @Mapping(source = "prenom", target = "prenom")
    @Mapping(source = "dateNaissance", target = "dateNaissance")
    @Mapping(source = "adresseEmail", target = "adresseEmail")
    @Mapping(source = "motDePasse", target = "motDePasse")
    @Mapping(source = "profile", target = "profile")
    @Mapping(source = "comments", target = "comments")
    @Mapping(source = "posts", target = "posts")
    UserDto userToUserDto(User user);


    @Mapping(source = "id", target = "id")
    @Mapping(source = "nom", target = "nom")
    @Mapping(source = "prenom", target = "prenom")
    @Mapping(source = "dateNaissance", target = "dateNaissance")
    @Mapping(source = "adresseEmail", target = "adresseEmail")
    @Mapping(source = "motDePasse", target = "motDePasse")
    @Mapping(source = "profile", target = "profile")
    @Mapping(source = "comments", target = "comments")
    @Mapping(source = "posts", target = "posts")
    User userDtoToUser(UserDto userDto);
}

