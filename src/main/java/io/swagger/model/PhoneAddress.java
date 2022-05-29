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
 * Data structure containing information that identifies a phone address
 */
@ApiModel(description = "Data structure containing information that identifies a phone address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class PhoneAddress   {
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("bestContactDays")
  @Valid
  private List<Object> bestContactDays = null;

  public PhoneAddress phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number, as defined by a telecom service
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+44-01142726444", value = "Phone number, as defined by a telecom service")

@Size(min=2,max=35) 
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneAddress bestContactDays(List<Object> bestContactDays) {
    this.bestContactDays = bestContactDays;
    return this;
  }

  public PhoneAddress addBestContactDaysItem(Object bestContactDaysItem) {
    if (this.bestContactDays == null) {
      this.bestContactDays = new ArrayList<Object>();
    }
    this.bestContactDays.add(bestContactDaysItem);
    return this;
  }

  /**
   * Data structure containing information about the best contact times by day for the phone address
   * @return bestContactDays
  **/
  @ApiModelProperty(value = "Data structure containing information about the best contact times by day for the phone address")


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
    PhoneAddress phoneAddress = (PhoneAddress) o;
    return Objects.equals(this.phoneNumber, phoneAddress.phoneNumber) &&
        Objects.equals(this.bestContactDays, phoneAddress.bestContactDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, bestContactDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAddress {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

