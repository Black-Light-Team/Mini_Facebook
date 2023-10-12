package com.example.logintest.Controller;

import com.example.logintest.Dto.UserDto;
import com.example.logintest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/utilisateurs")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUtilisateur(@PathVariable("userId") String id) {
        UserDto userDto=userService.getUser(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> createUtilisateur(@RequestBody UserDto userDto){
        System.out.println("dans la methode post");
        UserDto createdUserDto = userService.saveUser(userDto);
        if (createdUserDto != null) {
            // Les données ont été insérées avec succès, renvoyer HttpStatus.OK
            return new ResponseEntity<>(createdUserDto, HttpStatus.OK);
        } else {
            // Les données n'ont pas pu être insérées, renvoyer HttpStatus.NOT_FOUND
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUtilisateurs(){
        List<UserDto> utilsateurs = userService.allUsers();
        return new ResponseEntity<>(utilsateurs,HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUtilisateur(@PathVariable("userId") String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<UserDto> partialUpdateUtilisateur( @PathVariable("userId") String id,
                                                             @RequestBody UserDto userDto) {

        UserDto updatedUserDto = userService.updateUser(id,userDto);
        return new ResponseEntity<>(updatedUserDto,HttpStatus.OK);
    }


    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestBody UserDto userDto) {
        // Vérifier les données du formulaire par rapport à la base de données
        boolean authenticationSuccessful = userService.authenticateUser(userDto.getAdresseEmail(), userDto.getMotDePasse());
        System.out.println("email="+userDto.getAdresseEmail()+"  "+userDto.getMotDePasse());
        if (authenticationSuccessful) {
            // L'authentification réussit, vous pouvez retourner une réponse appropriée
            return new ResponseEntity<>("Authentication successful", HttpStatus.OK);
        } else {
            // L'authentification échoue, retournez une réponse avec un statut 401 Unauthorized
            return new ResponseEntity<>("Authentication failed", HttpStatus.NOT_FOUND);
        }
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
