package com.javaproject.friends.controller;

import com.javaproject.friends.model.Friends;
import com.javaproject.friends.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friends")
//fix cors error
@CrossOrigin
public class FriendsController {
    @Autowired
    private FriendsService friendsService;

    @PostMapping("/add")
    public String add(@RequestBody Friends friends){
        friendsService.saveFriends(friends);
        return  "New friend added";
    }

    @GetMapping("/getAll")
    public List<Friends> getAllFriends(){
        return friendsService.getAllFriends();
    }
}
