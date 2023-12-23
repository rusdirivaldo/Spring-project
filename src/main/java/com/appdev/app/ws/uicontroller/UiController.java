package com.appdev.app.ws.uicontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UiController {

    @GetMapping ("/{userId}")
    public String getUser (@PathVariable("userId") String id){
        return "Success get user with id "+id;
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
