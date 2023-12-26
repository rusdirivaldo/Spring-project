package com.appdev.app.ws.uicontroller;


import com.appdev.app.ws.model.response.UserRest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/users")
public class UiController {

    @GetMapping (path="/{userId}", produces = {
            MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE
    })
    public UserRest getUser (@PathVariable("userId") String id){
        UserRest userRest = new UserRest();
        userRest.setFirstName("rusdi");
        userRest.setLastName("rivaldo");
        userRest.setEmail("email@email.com");
        userRest.setUserid(id);
        return userRest;
    }

    @PostMapping
    public String addUser(){
        return "Success post User";
    }

    @PutMapping
    public String updateUser(){
        return "Success update user";
    }
    @DeleteMapping
    public String deleteUser(){
        return "Success Delete User";
    }


}
