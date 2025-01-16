package com.secor.jdev25userservice;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserDetail {

    @Id
    public String username;
    public String firstName;
    public String lastName;
    public String email;
    public String phone;

    public UserDetail(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "User[username='%s',firstName='%s,lastName='%s',email='%s',phone='%s' ]",
                username, firstName, lastName,email,phone);
    }

}

