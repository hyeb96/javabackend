package com.javaproject.friends.service;

import com.javaproject.friends.model.Friends;
import com.javaproject.friends.repository.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FriendsServiceImplementation implements FriendsService {
    @Autowired
    private FriendsRepository friendsRepository;
    @Override
    public Friends saveFriends(Friends friends) {
        return friendsRepository.save(friends);
    }

    @Override
    public List<Friends> getAllFriends() {
        return friendsRepository.findAll();
    }
}
