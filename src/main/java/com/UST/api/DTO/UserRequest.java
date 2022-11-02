package com.UST.api.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserRequest {
	@NotNull(message = "The username cannot not be empty")
	private String name;
	
	@Email(message = "Invalid email id")
	private String email;
	
	@Pattern(regexp = "\\d{10}$",message = "Invalid mobile number")
	private String mobile;
	
	private String gender;
	
	@Min(18)
	@Max(60)
	private int age;
	
	@NotBlank(message = "Nationality cannot be blank")
	private String nationality;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	

}
