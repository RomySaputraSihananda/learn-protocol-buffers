import protobuf from "protobufjs";

const printAll = (obj, cls) => {
  const serialized = cls.encode(obj).finish();
  const deserialized = cls.decode(serialized);
  const json = JSON.stringify(cls.toObject(deserialized), null, 2);

  console.log(serialized);
  console.log(deserialized);
  console.log(json);

  console.log(serialized.length);
  console.log(json.length);
};

protobuf.load("userSchema.proto", (err, root) => {
  if (err) throw err;

  const User = root.lookupType("User");
  const UserList = root.lookupType("UserList");
  const Address = root.lookupType("Address");
  const Company = root.lookupType("Company");

  const romy = User.create({
    id: 100120,
    fullName: "romy aja",
    age: 19,
    gender: "male",
    address: Address.create({
      address: "pondok aren",
      city: "tangerang selatan",
      country: "indonesia",
    }),
    company: Company.create({
      name: "ebdesk",
      address: Address.create({
        address: "pondok aren",
        city: "tangerang selatan",
        country: "indonesia",
      }),
    }),
    role: "admin",
  });
  printAll(romy, User);

  const romy2 = User.create({
    id: 100121,
    fullName: "romy aja nih 2",
    age: 19,
    gender: "male",
    address: Address.create({
      address: "pondok aren",
      city: "tangerang selatan",
      country: "indonesia",
    }),
    company: Company.create({
      name: "ebdesk",
      address: Address.create({
        address: "pondok aren",
        city: "tangerang selatan",
        country: "indonesia",
      }),
    }),
    role: "admin",
  });
  printAll(romy2, User);

  const userList = UserList.create({
    users: [romy, romy2],
  });

  printAll(userList, UserList);
});
