package com.library.library.service;

import com.library.library.dto.UserSaveDTO;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    String deletUser(int id);
}
