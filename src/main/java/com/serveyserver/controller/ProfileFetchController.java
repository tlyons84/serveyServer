package com.serveyserver.controller;

import com.serveyserver.profile.AdminObj;
import com.serveyserver.profile.UserObj;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest")
public class ProfileFetchController {

    public ArrayList<UserObj> fetchUsers(){
        ArrayList<UserObj> userObjs = new ArrayList<>();

        return userObjs;
    }

    public UserObj fetchUser(){
        UserObj userObj = new UserObj();
        return  userObj;
    }

    public AdminObj fetchAdmin(){
        AdminObj adminObj = new AdminObj();

        return adminObj;
    }

    public ArrayList<AdminObj> fetchAdmins(){
        ArrayList<AdminObj>  adminObjs = new ArrayList<>();

        return adminObjs;
    }
}
