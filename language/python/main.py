from userSchema_pb2  import (
    User,
    Address,
    Company,
    UserList
)

from google.protobuf import json_format

def print_all(obj, cls):
    serialized = obj.SerializeToString()
    
    deserialized = cls()
    deserialized.ParseFromString(serialized)
    
    json = json_format.MessageToJson(deserialized)

    print(serialized)
    print(deserialized)
    print(json)
    
    print(len(serialized))
    print(len(json))

def main():
    romy: User = User(
        id=100120,
        fullName='romy aja',
        age=19,
        gender='male',
        address=Address(
            address='pondok aren', 
            city='tangerang selatan', 
            country='indonesia'
        ),
        company=Company(
            name='ebdesk',
            address=Address(
                address='pondok aren', 
                city='tangerang selatan', 
                country='indonesia'
            )
        ),
        role='admin'
    )
    print_all(romy, User)

    romy2: User = User(
        id=100122,
        fullName='romy yang 2',
        age=19,
        gender='male',
        address=Address(
            address='pondok aren', 
            city='tangerang selatan', 
            country='indonesia'
        ),
        company=Company(
            name='ebdesk',
            address=Address(
                address='pondok aren', 
                city='tangerang selatan', 
                country='indonesia'
            )
        ),
        role='admin'
    )
    print_all(romy2, User)

    user_list: UserList = UserList()
    user_list.users.extend((romy, romy2))

    print_all(user_list, UserList)


if(__name__ == '__main__'):
    main()