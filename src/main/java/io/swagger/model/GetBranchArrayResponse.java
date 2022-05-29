package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GetBranchResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.
 */
@ApiModel(description = "Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class GetBranchArrayResponse   {
  @JsonProperty("branches")
  @Valid
  private List<GetBranchResponse> branches = null;

  public GetBranchArrayResponse branches(List<GetBranchResponse> branches) {
    this.branches = branches;
    return this;
  }

  public GetBranchArrayResponse addBranchesItem(GetBranchResponse branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<GetBranchResponse>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * Get branches
   * @return branches
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GetBranchResponse> getBranches() {
    return branches;
  }

  public void setBranches(List<GetBranchResponse> branches) {
    this.branches = branches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBranchArrayResponse getBranchArrayResponse = (GetBranchArrayResponse) o;
    return Objects.equals(this.branches, getBranchArrayResponse.branches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBranchArrayResponse {\n");
    
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
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

