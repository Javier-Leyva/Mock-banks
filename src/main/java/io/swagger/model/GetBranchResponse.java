package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ElectronicAddress;
import io.swagger.model.PhoneAddress;
import io.swagger.model.PostalAddress;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.
 */
@ApiModel(description = "Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class GetBranchResponse   {
  @JsonProperty("postalAddress")
  private PostalAddress postalAddress = null;

  @JsonProperty("phoneAddress")
  private PhoneAddress phoneAddress = null;

  @JsonProperty("electronicAddress")
  private ElectronicAddress electronicAddress = null;

  public GetBranchResponse postalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public GetBranchResponse phoneAddress(PhoneAddress phoneAddress) {
    this.phoneAddress = phoneAddress;
    return this;
  }

  /**
   * Get phoneAddress
   * @return phoneAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PhoneAddress getPhoneAddress() {
    return phoneAddress;
  }

  public void setPhoneAddress(PhoneAddress phoneAddress) {
    this.phoneAddress = phoneAddress;
  }

  public GetBranchResponse electronicAddress(ElectronicAddress electronicAddress) {
    this.electronicAddress = electronicAddress;
    return this;
  }

  /**
   * Get electronicAddress
   * @return electronicAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ElectronicAddress getElectronicAddress() {
    return electronicAddress;
  }

  public void setElectronicAddress(ElectronicAddress electronicAddress) {
    this.electronicAddress = electronicAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBranchResponse getBranchResponse = (GetBranchResponse) o;
    return Objects.equals(this.postalAddress, getBranchResponse.postalAddress) &&
        Objects.equals(this.phoneAddress, getBranchResponse.phoneAddress) &&
        Objects.equals(this.electronicAddress, getBranchResponse.electronicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalAddress, phoneAddress, electronicAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBranchResponse {\n");
    
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    phoneAddress: ").append(toIndentedString(phoneAddress)).append("\n");
    sb.append("    electronicAddress: ").append(toIndentedString(electronicAddress)).append("\n");
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

