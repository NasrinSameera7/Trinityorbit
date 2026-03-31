package com.trinityorbit.carbontracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    // This allows you to find a user's profile by their name
    UserProfile findByUsername(String username);
}