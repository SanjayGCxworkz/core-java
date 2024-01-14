package com.xworkz.emarketapp.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Users {
    private String userName;
    private int userId;
    private String address;
    private String gender;
    private String email;
    private long phoneNumber;
    private int age;
    private String passward;
    private String confirmPassward;
    private String debitCard;

    public  Users(){

    }


}
