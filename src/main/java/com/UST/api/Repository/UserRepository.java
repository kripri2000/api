package com.UST.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.api.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
