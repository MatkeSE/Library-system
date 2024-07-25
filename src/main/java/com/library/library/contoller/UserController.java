package com.library.library.contoller;

import com.library.library.dto.AuthorSaveDTO;
import com.library.library.dto.UserSaveDTO;
import com.library.library.service.AuthorService;
import com.library.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String authorname = userService.addUser(userSaveDTO);
        return  "Added Successfully";
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")int id)
    {
        String authorname = userService.deletUser(id);
        return  "deleteddd";
    }
}
