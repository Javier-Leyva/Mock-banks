package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information that locates and identifies a postal address
 */
@ApiModel(description = "Data structure containing information that locates and identifies a postal address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class PostalAddress   {
  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetBuildingIdentification")
  private String streetBuildingIdentification = null;

  @JsonProperty("postCodeIdentification")
  private String postCodeIdentification = null;

  @JsonProperty("townName")
  private String townName = null;

  @JsonProperty("state")
  private Object state = null;

  @JsonProperty("buildingName")
  private String buildingName = null;

  @JsonProperty("floor")
  private String floor = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("regionIdentification")
  private Object regionIdentification = null;

  @JsonProperty("countyIdentification")
  private Object countyIdentification = null;

  @JsonProperty("postOfficeBox")
  private String postOfficeBox = null;

  @JsonProperty("province")
  private Object province = null;

  @JsonProperty("department")
  private String department = null;

  @JsonProperty("subDepartment")
  private String subDepartment = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("country")
  private Object country = null;

  public PostalAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare
   * @return streetName
  **/
  @ApiModelProperty(example = "Avenida de Toledo", value = "Name of a street or thoroughfare")

@Size(min=1,max=64) 
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public PostalAddress streetBuildingIdentification(String streetBuildingIdentification) {
    this.streetBuildingIdentification = streetBuildingIdentification;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street
   * @return streetBuildingIdentification
  **/
  @ApiModelProperty(example = "22", value = "Number that identifies the position of a building on a street")

@Size(min=1,max=56) 
  public String getStreetBuildingIdentification() {
    return streetBuildingIdentification;
  }

  public void setStreetBuildingIdentification(String streetBuildingIdentification) {
    this.streetBuildingIdentification = streetBuildingIdentification;
  }

  public PostalAddress postCodeIdentification(String postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
    return this;
  }

  /**
   * Postal code.  The value consists of a group of letters and/or numbers that is added to a postal address to assist in sorting the mail.
   * @return postCodeIdentification
  **/
  @ApiModelProperty(example = "28660", value = "Postal code.  The value consists of a group of letters and/or numbers that is added to a postal address to assist in sorting the mail.")

@Size(max=16) 
  public String getPostCodeIdentification() {
    return postCodeIdentification;
  }

  public void setPostCodeIdentification(String postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
  }

  public PostalAddress townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area with defined boundaries and a local government
   * @return townName
  **/
  @ApiModelProperty(example = "MADRID", value = "Name of a built-up area with defined boundaries and a local government")

@Size(max=70) 
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public PostalAddress state(Object state) {
    this.state = state;
    return this;
  }

  /**
   * Data structure containing state information
   * @return state
  **/
  @ApiModelProperty(value = "Data structure containing state information")


  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }

  public PostalAddress buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Name of the building or house
   * @return buildingName
  **/
  @ApiModelProperty(example = "Residencial Los Pinos", value = "Name of the building or house")

@Size(max=35) 
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public PostalAddress floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * Floor or storey within a building
   * @return floor
  **/
  @ApiModelProperty(example = "3", value = "Floor or storey within a building")

@Size(max=16) 
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public PostalAddress districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Name of a district, for example, a part of a town or region
   * @return districtName
  **/
  @ApiModelProperty(example = "Chamartin", value = "Name of a district, for example, a part of a town or region")

@Size(max=35) 
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public PostalAddress regionIdentification(Object regionIdentification) {
    this.regionIdentification = regionIdentification;
    return this;
  }

  /**
   * Data structure containing region information
   * @return regionIdentification
  **/
  @ApiModelProperty(value = "Data structure containing region information")


  public Object getRegionIdentification() {
    return regionIdentification;
  }

  public void setRegionIdentification(Object regionIdentification) {
    this.regionIdentification = regionIdentification;
  }

  public PostalAddress countyIdentification(Object countyIdentification) {
    this.countyIdentification = countyIdentification;
    return this;
  }

  /**
   * Data structure containing county information
   * @return countyIdentification
  **/
  @ApiModelProperty(value = "Data structure containing county information")


  public Object getCountyIdentification() {
    return countyIdentification;
  }

  public void setCountyIdentification(Object countyIdentification) {
    this.countyIdentification = countyIdentification;
  }

  public PostalAddress postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  /**
   * Number of a box in a post office, assigned to a person or organization.  Letters are stored in the box until called for.
   * @return postOfficeBox
  **/
  @ApiModelProperty(example = "8080", value = "Number of a box in a post office, assigned to a person or organization.  Letters are stored in the box until called for.")

@Size(min=1,max=10) 
  public String getPostOfficeBox() {
    return postOfficeBox;
  }

  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  public PostalAddress province(Object province) {
    this.province = province;
    return this;
  }

  /**
   * Data structure containing province information
   * @return province
  **/
  @ApiModelProperty(value = "Data structure containing province information")


  public Object getProvince() {
    return province;
  }

  public void setProvince(Object province) {
    this.province = province;
  }

  public PostalAddress department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Name of a division within a large organization or building
   * @return department
  **/
  @ApiModelProperty(example = "Generic department name", value = "Name of a division within a large organization or building")

@Size(max=70) 
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public PostalAddress subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Name of a sub-division within a large organization or building
   * @return subDepartment
  **/
  @ApiModelProperty(example = "Generic subdepartment name", value = "Name of a sub-division within a large organization or building")

@Size(max=70) 
  public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public PostalAddress location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Generic location name that specifies a place
   * @return location
  **/
  @ApiModelProperty(example = "Generic location", value = "Generic location name that specifies a place")

@Size(max=16) 
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PostalAddress country(Object country) {
    this.country = country;
    return this;
  }

  /**
   * Data structure containing country information
   * @return country
  **/
  @ApiModelProperty(value = "Data structure containing country information")


  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.streetName, postalAddress.streetName) &&
        Objects.equals(this.streetBuildingIdentification, postalAddress.streetBuildingIdentification) &&
        Objects.equals(this.postCodeIdentification, postalAddress.postCodeIdentification) &&
        Objects.equals(this.townName, postalAddress.townName) &&
        Objects.equals(this.state, postalAddress.state) &&
        Objects.equals(this.buildingName, postalAddress.buildingName) &&
        Objects.equals(this.floor, postalAddress.floor) &&
        Objects.equals(this.districtName, postalAddress.districtName) &&
        Objects.equals(this.regionIdentification, postalAddress.regionIdentification) &&
        Objects.equals(this.countyIdentification, postalAddress.countyIdentification) &&
        Objects.equals(this.postOfficeBox, postalAddress.postOfficeBox) &&
        Objects.equals(this.province, postalAddress.province) &&
        Objects.equals(this.department, postalAddress.department) &&
        Objects.equals(this.subDepartment, postalAddress.subDepartment) &&
        Objects.equals(this.location, postalAddress.location) &&
        Objects.equals(this.country, postalAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetName, streetBuildingIdentification, postCodeIdentification, townName, state, buildingName, floor, districtName, regionIdentification, countyIdentification, postOfficeBox, province, department, subDepartment, location, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetBuildingIdentification: ").append(toIndentedString(streetBuildingIdentification)).append("\n");
    sb.append("    postCodeIdentification: ").append(toIndentedString(postCodeIdentification)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    regionIdentification: ").append(toIndentedString(regionIdentification)).append("\n");
    sb.append("    countyIdentification: ").append(toIndentedString(countyIdentification)).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

