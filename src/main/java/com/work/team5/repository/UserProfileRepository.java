package com.work.team5.repository;

import com.work.team5.model.User;
import com.work.team5.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByUser(User user);
}
