package com.example.greenstock_service.services;

import com.example.greenstock_service.models.entities.Users;
import com.example.greenstock_service.services.implementations.UsersServiceImpl;

import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();
}
