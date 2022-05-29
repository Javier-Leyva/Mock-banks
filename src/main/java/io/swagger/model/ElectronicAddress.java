package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information that identifies an electronic address
 */
@ApiModel(description = "Data structure containing information that identifies an electronic address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class ElectronicAddress   {
  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("bestContactDays")
  @Valid
  private List<Object> bestContactDays = null;

  public ElectronicAddress emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address
   * @return emailAddress
  **/
  @ApiModelProperty(example = "testjulicert@test2.co", value = "Email address")

@Size(min=2,max=256) 
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ElectronicAddress bestContactDays(List<Object> bestContactDays) {
    this.bestContactDays = bestContactDays;
    return this;
  }

  public ElectronicAddress addBestContactDaysItem(Object bestContactDaysItem) {
    if (this.bestContactDays == null) {
      this.bestContactDays = new ArrayList<Object>();
    }
    this.bestContactDays.add(bestContactDaysItem);
    return this;
  }

  /**
   * Data structure containing information about the best contact times by day for the electronic address
   * @return bestContactDays
  **/
  @ApiModelProperty(value = "Data structure containing information about the best contact times by day for the electronic address")


  public List<Object> getBestContactDays() {
    return bestContactDays;
  }

  public void setBestContactDays(List<Object> bestContactDays) {
    this.bestContactDays = bestContactDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicAddress electronicAddress = (ElectronicAddress) o;
    return Objects.equals(this.emailAddress, electronicAddress.emailAddress) &&
        Objects.equals(this.bestContactDays, electronicAddress.bestContactDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, bestContactDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicAddress {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    bestContactDays: ").append(toIndentedString(bestContactDays)).append("\n");
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

