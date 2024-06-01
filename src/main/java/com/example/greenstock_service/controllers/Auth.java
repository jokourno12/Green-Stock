package com.example.greenstock_service.controllers;

import com.example.greenstock_service.models.entities.Users;
import com.example.greenstock_service.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class Auth {
    private UsersService usersService;

    @PostMapping("/create")
    public String createData(){
        return "This is created data";
    }

    @GetMapping("/read")
    public List<Users> readData(){
        System.out.println("Joko" +usersService.getAllUsers());
        return usersService.getAllUsers();
    }

    @PutMapping("/update")
    public String updateData(){
        return "This is update data";
    }

    @PatchMapping("/modify")
    public String modifyData(){
        return "This is modified data";
    }

    @DeleteMapping("/delete")
    public String deleteData(){
        return "This is delete data";
    }
}
