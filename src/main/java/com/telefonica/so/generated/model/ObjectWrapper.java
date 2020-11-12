package com.telefonica.so.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.telefonica.so.generated.model.ObjectCharacteristicValueType;
import com.telefonica.so.generated.model.ProductSpecCharacteristicType;
import com.telefonica.so.generated.model.ProductSpecCharacteristicValueType;
import com.telefonica.so.generated.model.TimePeriodType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ObjectWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T17:01:10.478-05:00")

public class ObjectWrapper  implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("validFor")
  private TimePeriodType validFor = null;

  @JsonProperty("productSpecCharacteristicValue")
  private List<ProductSpecCharacteristicValueType> productSpecCharacteristicValue = new ArrayList<ProductSpecCharacteristicValueType>();

  @JsonProperty("objectCharacteristicValue")
  private ObjectCharacteristicValueType objectCharacteristicValue = null;

  public ObjectWrapper id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the product characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the product characteristic")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObjectWrapper name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the product characteristic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the product characteristic")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObjectWrapper description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A narrative that explains the characteristic
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains the characteristic")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObjectWrapper validFor(TimePeriodType validFor) {
    this.validFor = validFor;
    return this;
  }

   /**
   * The period of time for which a characteristic is applicable
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which a characteristic is applicable")
  public TimePeriodType getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriodType validFor) {
    this.validFor = validFor;
  }

  public ObjectWrapper productSpecCharacteristicValue(List<ProductSpecCharacteristicValueType> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
    return this;
  }

  public ObjectWrapper addProductSpecCharacteristicValueItem(ProductSpecCharacteristicValueType productSpecCharacteristicValueItem) {
    this.productSpecCharacteristicValue.add(productSpecCharacteristicValueItem);
    return this;
  }

   /**
   * List of values that could be configured for a given characteristic when valueType is different from object
   * @return productSpecCharacteristicValue
  **/
  @ApiModelProperty(value = "List of values that could be configured for a given characteristic when valueType is different from object")
  public List<ProductSpecCharacteristicValueType> getProductSpecCharacteristicValue() {
    return productSpecCharacteristicValue;
  }

  public void setProductSpecCharacteristicValue(List<ProductSpecCharacteristicValueType> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
  }

  public ObjectWrapper objectCharacteristicValue(ObjectCharacteristicValueType objectCharacteristicValue) {
    this.objectCharacteristicValue = objectCharacteristicValue;
    return this;
  }

   /**
   * Value of the characteristic when valueType is object
   * @return objectCharacteristicValue
  **/
  @ApiModelProperty(value = "Value of the characteristic when valueType is object")
  public ObjectCharacteristicValueType getObjectCharacteristicValue() {
    return objectCharacteristicValue;
  }

  public void setObjectCharacteristicValue(ObjectCharacteristicValueType objectCharacteristicValue) {
    this.objectCharacteristicValue = objectCharacteristicValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWrapper objectWrapper = (ObjectWrapper) o;
    return Objects.equals(this.id, objectWrapper.id) &&
        Objects.equals(this.name, objectWrapper.name) &&
        Objects.equals(this.description, objectWrapper.description) &&
        Objects.equals(this.validFor, objectWrapper.validFor) &&
        Objects.equals(this.productSpecCharacteristicValue, objectWrapper.productSpecCharacteristicValue) &&
        Objects.equals(this.objectCharacteristicValue, objectWrapper.objectCharacteristicValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, validFor, productSpecCharacteristicValue, objectCharacteristicValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWrapper {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    productSpecCharacteristicValue: ").append(toIndentedString(productSpecCharacteristicValue)).append("\n");
    sb.append("    objectCharacteristicValue: ").append(toIndentedString(objectCharacteristicValue)).append("\n");
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

