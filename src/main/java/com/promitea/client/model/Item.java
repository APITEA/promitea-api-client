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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * An item entity
 */
@ApiModel(description = "An item entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-13T07:34:05.936Z")
public class Item {
  @SerializedName("additionalNames")
  private List<Text> additionalNames = null;

  @SerializedName("deliveryDate")
  private OffsetDateTime deliveryDate = null;

  @SerializedName("description")
  private Text description = null;

  @SerializedName("documents")
  private List<Document> documents = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("items")
  private List<Item> items = null;

  @SerializedName("manufacturerId")
  private String manufacturerId = null;

  @SerializedName("measureUnit")
  private String measureUnit = null;

  @SerializedName("name")
  private Text name = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  public Item additionalNames(List<Text> additionalNames) {
    this.additionalNames = additionalNames;
    return this;
  }

  public Item addAdditionalNamesItem(Text additionalNamesItem) {
    if (this.additionalNames == null) {
      this.additionalNames = new ArrayList<Text>();
    }
    this.additionalNames.add(additionalNamesItem);
    return this;
  }

   /**
   * additional item names
   * @return additionalNames
  **/
  @ApiModelProperty(value = "additional item names")
  public List<Text> getAdditionalNames() {
    return additionalNames;
  }

  public void setAdditionalNames(List<Text> additionalNames) {
    this.additionalNames = additionalNames;
  }

  public Item deliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * delivery date
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "delivery date")
  public OffsetDateTime getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Item description(Text description) {
    this.description = description;
    return this;
  }

   /**
   * item description
   * @return description
  **/
  @ApiModelProperty(value = "item description")
  public Text getDescription() {
    return description;
  }

  public void setDescription(Text description) {
    this.description = description;
  }

  public Item documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Item addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * item documents
   * @return documents
  **/
  @ApiModelProperty(value = "item documents")
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public Item id(String id) {
    this.id = id;
    return this;
  }

   /**
   * item id
   * @return id
  **/
  @ApiModelProperty(value = "item id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Item addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Item>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * group sub items
   * @return items
  **/
  @ApiModelProperty(value = "group sub items")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Item manufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
    return this;
  }

   /**
   * manufactured id
   * @return manufacturerId
  **/
  @ApiModelProperty(value = "manufactured id")
  public String getManufacturerId() {
    return manufacturerId;
  }

  public void setManufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
  }

  public Item measureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
    return this;
  }

   /**
   * measure unit code
   * @return measureUnit
  **/
  @ApiModelProperty(value = "measure unit code")
  public String getMeasureUnit() {
    return measureUnit;
  }

  public void setMeasureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
  }

  public Item name(Text name) {
    this.name = name;
    return this;
  }

   /**
   * item name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "item name")
  public Text getName() {
    return name;
  }

  public void setName(Text name) {
    this.name = name;
  }

  public Item quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * item quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "item quantity")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.additionalNames, item.additionalNames) &&
        Objects.equals(this.deliveryDate, item.deliveryDate) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.documents, item.documents) &&
        Objects.equals(this.id, item.id) &&
        Objects.equals(this.items, item.items) &&
        Objects.equals(this.manufacturerId, item.manufacturerId) &&
        Objects.equals(this.measureUnit, item.measureUnit) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.quantity, item.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, deliveryDate, description, documents, id, items, manufacturerId, measureUnit, name, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
    sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

