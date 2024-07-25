package com.library.library.service.impl;

import com.library.library.dto.UserSaveDTO;
import com.library.library.entity.Author;
import com.library.library.entity.User;
import com.library.library.repo.UserRepo;
import com.library.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User u = new User(
                userSaveDTO.getName(),
                userSaveDTO.getEmail()
        );
        userRepo.save(u);
        return u.getName();
    }

    @Override
    public String deletUser(int id) {
        if(userRepo.existsById(id))
        {
            userRepo.deleteById(id);
        }
        else
        {
            System.out.println("ID Not Found");
        }
        return null;
    }
}
