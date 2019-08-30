/*
 * Promitea REST API v2
 * Promitea REST API v2
 *
 * OpenAPI spec version: 2.0
 * Contact: support@apitea.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.promitea.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * User entity
 */
@ApiModel(description = "User entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-30T09:33:10.349Z")
public class UserToRegister {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("phone")
  private String phone = null;

  public UserToRegister email(String email) {
    this.email = email;
    return this;
  }

   /**
   * user email
   * @return email
  **/
  @ApiModelProperty(example = "wilson@promitea.com", required = true, value = "user email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserToRegister firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * user first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Scott", required = true, value = "user first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

   /**
   * user Promitea id
   * @return id
  **/
  @ApiModelProperty(value = "user Promitea id")
  public String getId() {
    return id;
  }

  public UserToRegister lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * user last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Wilson", required = true, value = "user last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserToRegister phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * user phone
   * @return phone
  **/
  @ApiModelProperty(example = "413-395-6582", value = "user phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserToRegister userToRegister = (UserToRegister) o;
    return Objects.equals(this.email, userToRegister.email) &&
        Objects.equals(this.firstName, userToRegister.firstName) &&
        Objects.equals(this.id, userToRegister.id) &&
        Objects.equals(this.lastName, userToRegister.lastName) &&
        Objects.equals(this.phone, userToRegister.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserToRegister {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
