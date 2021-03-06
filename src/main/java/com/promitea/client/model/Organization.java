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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Organization entity
 */
@ApiModel(description = "Organization entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T13:25:47.817Z")
public class Organization {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private UserToRegister user = null;

  public Organization email(String email) {
    this.email = email;
    return this;
  }

   /**
   * organization email
   * @return email
  **/
  @ApiModelProperty(example = "test@promitea.com", value = "organization email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

   /**
   * organisation Promitea id
   * @return id
  **/
  @ApiModelProperty(value = "organisation Promitea id")
  public String getId() {
    return id;
  }

  public Organization language(String language) {
    this.language = language;
    return this;
  }

   /**
   * language iso code
   * @return language
  **/
  @ApiModelProperty(example = "en", value = "language iso code")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * organization name
   * @return name
  **/
  @ApiModelProperty(example = "Data Systems", required = true, value = "organization name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization user(UserToRegister user) {
    this.user = user;
    return this;
  }

   /**
   * user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "user")
  public UserToRegister getUser() {
    return user;
  }

  public void setUser(UserToRegister user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.email, organization.email) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.language, organization.language) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.user, organization.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, language, name, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

