#include <iostream>
#include <fstream>
#include "userSchema.pb.h"

int main() {
    GOOGLE_PROTOBUF_VERIFY_VERSION;

    user::Address address;
    address.set_address("pondok aren");
    address.set_city("tangerang selatan");
    address.set_country("indonesia");

    user::Company company;
    company.set_name("ebdesk");
    *company.mutable_address() = address;

    user::User user;
    user.set_id(100122);
    user.set_fullname("romy yang 2");
    user.set_age(19);
    user.set_gender("male");
    *user.mutable_address() = address;
    *user.mutable_company() = company;
    user.set_role("admin");

    user::UserList userList;
    userList.add_users(user);

    return 0;
}
