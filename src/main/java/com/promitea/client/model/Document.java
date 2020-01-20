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
 * A document entity
 */
@ApiModel(description = "A document entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T13:25:47.817Z")
public class Document {
  @SerializedName("data")
  private String data = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public Document data(String data) {
    this.data = data;
    return this;
  }

   /**
   * document data
   * @return data
  **/
  @ApiModelProperty(example = "document text", value = "document data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Document fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * document file name
   * @return fileName
  **/
  @ApiModelProperty(example = "document.txt", value = "document file name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Document mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * document mime type
   * @return mimeType
  **/
  @ApiModelProperty(example = "text", value = "document mime type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * document name
   * @return name
  **/
  @ApiModelProperty(example = "Document", required = true, value = "document name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document type(String type) {
    this.type = type;
    return this;
  }

   /**
   * document type
   * @return type
  **/
  @ApiModelProperty(example = "text", value = "document type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.data, document.data) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.mimeType, document.mimeType) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.type, document.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, fileName, mimeType, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

