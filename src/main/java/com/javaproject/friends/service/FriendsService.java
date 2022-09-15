package com.javaproject.friends.service;

import com.javaproject.friends.model.Friends;

import java.util.List;

public interface FriendsService {
    public Friends saveFriends(Friends friends);
    public List<Friends> getAllFriends();
}
