package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Bank;
import io.swagger.model.Contract;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing bank details
 */
@ApiModel(description = "Data structure containing bank details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class GetBankCalculateResponse   {
  @JsonProperty("contract")
  private Contract contract = null;

  @JsonProperty("bank")
  private Bank bank = null;

  public GetBankCalculateResponse contract(Contract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Contract getContract() {
    return contract;
  }

  public void setContract(Contract contract) {
    this.contract = contract;
  }

  public GetBankCalculateResponse bank(Bank bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBankCalculateResponse getBankCalculateResponse = (GetBankCalculateResponse) o;
    return Objects.equals(this.contract, getBankCalculateResponse.contract) &&
        Objects.equals(this.bank, getBankCalculateResponse.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, bank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBankCalculateResponse {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

