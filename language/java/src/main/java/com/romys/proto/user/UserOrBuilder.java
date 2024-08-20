// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: userSchema.proto
// Protobuf Java Version: 4.27.3

package com.romys.proto.user;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string fullName = 2;</code>
   * @return The fullName.
   */
  java.lang.String getFullName();
  /**
   * <code>string fullName = 2;</code>
   * @return The bytes for fullName.
   */
  com.google.protobuf.ByteString
      getFullNameBytes();

  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>string gender = 4;</code>
   * @return The gender.
   */
  java.lang.String getGender();
  /**
   * <code>string gender = 4;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();

  /**
   * <code>.user.Address address = 5;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.user.Address address = 5;</code>
   * @return The address.
   */
  com.romys.proto.user.Address getAddress();
  /**
   * <code>.user.Address address = 5;</code>
   */
  com.romys.proto.user.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>.user.Company company = 6;</code>
   * @return Whether the company field is set.
   */
  boolean hasCompany();
  /**
   * <code>.user.Company company = 6;</code>
   * @return The company.
   */
  com.romys.proto.user.Company getCompany();
  /**
   * <code>.user.Company company = 6;</code>
   */
  com.romys.proto.user.CompanyOrBuilder getCompanyOrBuilder();

  /**
   * <code>string role = 7;</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 7;</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
