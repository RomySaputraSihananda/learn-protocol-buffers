package com.romys.proto;

import com.romys.proto.user.Address;

public class App {
    public static void main( String[] args ){
        Address address = Address
            .newBuilder()
            .build();   

        Company company = Company.newBuilder()
            .setName("ebdesk")
            .setAddress(address)
            .build();

        User user = User.newBuilder()
            .setId(100122)
            .setFullName("romy yang 2")
            .setAge(19)
            .setGender("male")
            .setAddress(address)
            .setCompany(company)
            .setRole("admin")
            .build();

        UserList userList = UserList.newBuilder()
            .addUsers(user)
            .build();
    }
}
