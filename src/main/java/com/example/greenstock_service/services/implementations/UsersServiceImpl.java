package com.example.greenstock_service.services.implementations;

import com.example.greenstock_service.models.entities.Users;
import com.example.greenstock_service.repositories.UsersRepository;
import com.example.greenstock_service.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {
    private UsersRepository usersRepository;
    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
