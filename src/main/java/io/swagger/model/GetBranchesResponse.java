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
 * Data structure containing bank centre details
 */
@ApiModel(description = "Data structure containing bank centre details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class GetBranchesResponse   {
  @JsonProperty("address")
  private Object address = null;

  @JsonProperty("centerId")
  private String centerId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneAddresses")
  @Valid
  private List<Object> phoneAddresses = null;

  @JsonProperty("zone")
  private String zone = null;

  public GetBranchesResponse address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * Data structure containing information that locates and identifies a postal address
   * @return address
  **/
  @ApiModelProperty(value = "Data structure containing information that locates and identifies a postal address")


  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public GetBranchesResponse centerId(String centerId) {
    this.centerId = centerId;
    return this;
  }

  /**
   * Bank centre ID
   * @return centerId
  **/
  @ApiModelProperty(example = "0014", value = "Bank centre ID")

@Size(min=4,max=4) 
  public String getCenterId() {
    return centerId;
  }

  public void setCenterId(String centerId) {
    this.centerId = centerId;
  }

  public GetBranchesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Bank centre name
   * @return name
  **/
  @ApiModelProperty(example = "ALMIRANTE REIS", value = "Bank centre name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetBranchesResponse phoneAddresses(List<Object> phoneAddresses) {
    this.phoneAddresses = phoneAddresses;
    return this;
  }

  public GetBranchesResponse addPhoneAddressesItem(Object phoneAddressesItem) {
    if (this.phoneAddresses == null) {
      this.phoneAddresses = new ArrayList<Object>();
    }
    this.phoneAddresses.add(phoneAddressesItem);
    return this;
  }

  /**
   * Array of information that identifies a phone address
   * @return phoneAddresses
  **/
  @ApiModelProperty(value = "Array of information that identifies a phone address")


  public List<Object> getPhoneAddresses() {
    return phoneAddresses;
  }

  public void setPhoneAddresses(List<Object> phoneAddresses) {
    this.phoneAddresses = phoneAddresses;
  }

  public GetBranchesResponse zone(String zone) {
    this.zone = zone;
    return this;
  }

  /**
   * zone id
   * @return zone
  **/
  @ApiModelProperty(example = "6302", value = "zone id")


  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBranchesResponse getBranchesResponse = (GetBranchesResponse) o;
    return Objects.equals(this.address, getBranchesResponse.address) &&
        Objects.equals(this.centerId, getBranchesResponse.centerId) &&
        Objects.equals(this.name, getBranchesResponse.name) &&
        Objects.equals(this.phoneAddresses, getBranchesResponse.phoneAddresses) &&
        Objects.equals(this.zone, getBranchesResponse.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, centerId, name, phoneAddresses, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBranchesResponse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    centerId: ").append(toIndentedString(centerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneAddresses: ").append(toIndentedString(phoneAddresses)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

