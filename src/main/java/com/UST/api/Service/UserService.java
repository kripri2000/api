package com.UST.api.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.api.DTO.UserRequest;
import com.UST.api.Model.User;
import com.UST.api.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepo;
	
	public User saveUser(@Valid UserRequest userrequest) {
		User user = new User();
		user.setName(userrequest.getName());
		user.setEmail(userrequest.getEmail());
		user.setGender(userrequest.getGender());
		user.setMobile(userrequest.getMobile());
		user.setAge(userrequest.getAge());
		user.setNationality(userrequest.getNationality());
		return userrepo.save(user);
	}

	public List<User> getAllUsers() {
		return userrepo.findAll();
	}

}
