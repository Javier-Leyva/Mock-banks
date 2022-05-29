package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Bank;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about banks. A bank is a code, name, status, logo and bank id.
 */
@ApiModel(description = "Data structure containing information about banks. A bank is a code, name, status, logo and bank id.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class GetBankArrayResponse   {
  @JsonProperty("banks")
  @Valid
  private List<Bank> banks = null;

  public GetBankArrayResponse banks(List<Bank> banks) {
    this.banks = banks;
    return this;
  }

  public GetBankArrayResponse addBanksItem(Bank banksItem) {
    if (this.banks == null) {
      this.banks = new ArrayList<Bank>();
    }
    this.banks.add(banksItem);
    return this;
  }

  /**
   * Get banks
   * @return banks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Bank> getBanks() {
    return banks;
  }

  public void setBanks(List<Bank> banks) {
    this.banks = banks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBankArrayResponse getBankArrayResponse = (GetBankArrayResponse) o;
    return Objects.equals(this.banks, getBankArrayResponse.banks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBankArrayResponse {\n");
    
    sb.append("    banks: ").append(toIndentedString(banks)).append("\n");
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

