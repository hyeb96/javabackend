package com.javaproject.friends.repository;

import com.javaproject.friends.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FriendsRepository extends JpaRepository<Friends, Integer>{
}
