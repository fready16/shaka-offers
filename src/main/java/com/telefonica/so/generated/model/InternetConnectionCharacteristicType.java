package com.telefonica.so.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.telefonica.so.generated.model.ConnectionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * InternetConnectionCharacteristicType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T17:01:10.478-05:00")

public class InternetConnectionCharacteristicType  implements Serializable {
  @JsonProperty("connection")
  private ConnectionType connection = null;

  public InternetConnectionCharacteristicType connection(ConnectionType connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Information for broadband/internet type products, providing details on connections characteristics
   * @return connection
  **/
  @ApiModelProperty(required = true, value = "Information for broadband/internet type products, providing details on connections characteristics")
  @NotNull
  public ConnectionType getConnection() {
    return connection;
  }

  public void setConnection(ConnectionType connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternetConnectionCharacteristicType internetConnectionCharacteristicType = (InternetConnectionCharacteristicType) o;
    return Objects.equals(this.connection, internetConnectionCharacteristicType.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternetConnectionCharacteristicType {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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

