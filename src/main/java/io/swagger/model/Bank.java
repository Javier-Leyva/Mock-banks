package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Logo;
import io.swagger.model.StatusInfo;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing bank details
 */
@ApiModel(description = "Data structure containing bank details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class Bank   {
  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bic")
  private String bic = null;

  /**
   * Type of refresh of information for this particular bank
   */
  public enum TypeRefreshEnum {
    PSD2("PSD2"),
    
    NOPSD2("NOPSD2"),
    
    INTERNAL("INTERNAL");

    private String value;

    TypeRefreshEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeRefreshEnum fromValue(String text) {
      for (TypeRefreshEnum b : TypeRefreshEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeRefresh")
  private TypeRefreshEnum typeRefresh = null;

  @JsonProperty("oldestTransactionDate")
  private LocalDate oldestTransactionDate = null;

  @JsonProperty("lastRequestDateTime")
  private OffsetDateTime lastRequestDateTime = null;

  @JsonProperty("contactPoint")
  private Object contactPoint = null;

  @JsonProperty("bankId")
  private String bankId = null;

  @JsonProperty("center")
  private Object center = null;

  @JsonProperty("logo")
  private Logo logo = null;

  @JsonProperty("status")
  private StatusInfo status = null;

  public Bank bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Bank name
   * @return bankName
  **/
  @ApiModelProperty(example = "banco santander mexico", value = "Bank name")

@Size(min=0,max=50) 
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Bank bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Bank identifier code (BIC)
   * @return bic
  **/
  @ApiModelProperty(example = "BCMRMXMMTIN", value = "Bank identifier code (BIC)")

@Size(min=8,max=11) 
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Bank typeRefresh(TypeRefreshEnum typeRefresh) {
    this.typeRefresh = typeRefresh;
    return this;
  }

  /**
   * Type of refresh of information for this particular bank
   * @return typeRefresh
  **/
  @ApiModelProperty(example = "PSD2", value = "Type of refresh of information for this particular bank")

@Size(min=0,max=15) 
  public TypeRefreshEnum getTypeRefresh() {
    return typeRefresh;
  }

  public void setTypeRefresh(TypeRefreshEnum typeRefresh) {
    this.typeRefresh = typeRefresh;
  }

  public Bank oldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
    return this;
  }

  /**
   * Balance last update date. The value uses the complete data format defined in ISO 8601: 'YYYY-MM-DD' Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return oldestTransactionDate
  **/
  @ApiModelProperty(example = "2020-12-01", value = "Balance last update date. The value uses the complete data format defined in ISO 8601: 'YYYY-MM-DD' Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getOldestTransactionDate() {
    return oldestTransactionDate;
  }

  public void setOldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
  }

  public Bank lastRequestDateTime(OffsetDateTime lastRequestDateTime) {
    this.lastRequestDateTime = lastRequestDateTime;
    return this;
  }

  /**
   * Date and time when last request was done.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DDThh:mm:ss.sssTZD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31) - hh: 2-digit hour of the day (00 through 23) - mm: 2-digit minute of the hour (00 through 59) - ss.sss: 5-digit seconds and milliseconds, separated by a point - TZD: Time zone indicator
   * @return lastRequestDateTime
  **/
  @ApiModelProperty(example = "1998-03-14T17:32:28.123Z", value = "Date and time when last request was done.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DDThh:mm:ss.sssTZD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31) - hh: 2-digit hour of the day (00 through 23) - mm: 2-digit minute of the hour (00 through 59) - ss.sss: 5-digit seconds and milliseconds, separated by a point - TZD: Time zone indicator")

  @Valid

  public OffsetDateTime getLastRequestDateTime() {
    return lastRequestDateTime;
  }

  public void setLastRequestDateTime(OffsetDateTime lastRequestDateTime) {
    this.lastRequestDateTime = lastRequestDateTime;
  }

  public Bank contactPoint(Object contactPoint) {
    this.contactPoint = contactPoint;
    return this;
  }

  /**
   * Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.
   * @return contactPoint
  **/
  @ApiModelProperty(value = "Data structure containing information about a contact point. A contact point is a phone number, physical address, or virtual address used for communication purposes.")


  public Object getContactPoint() {
    return contactPoint;
  }

  public void setContactPoint(Object contactPoint) {
    this.contactPoint = contactPoint;
  }

  public Bank bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Unique bank ID
   * @return bankId
  **/
  @ApiModelProperty(example = "0030", value = "Unique bank ID")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public Bank center(Object center) {
    this.center = center;
    return this;
  }

  /**
   * Data structure containing bank centre details
   * @return center
  **/
  @ApiModelProperty(value = "Data structure containing bank centre details")


  public Object getCenter() {
    return center;
  }

  public void setCenter(Object center) {
    this.center = center;
  }

  public Bank logo(Logo logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Logo getLogo() {
    return logo;
  }

  public void setLogo(Logo logo) {
    this.logo = logo;
  }

  public Bank status(StatusInfo status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusInfo getStatus() {
    return status;
  }

  public void setStatus(StatusInfo status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(this.bankName, bank.bankName) &&
        Objects.equals(this.bic, bank.bic) &&
        Objects.equals(this.typeRefresh, bank.typeRefresh) &&
        Objects.equals(this.oldestTransactionDate, bank.oldestTransactionDate) &&
        Objects.equals(this.lastRequestDateTime, bank.lastRequestDateTime) &&
        Objects.equals(this.contactPoint, bank.contactPoint) &&
        Objects.equals(this.bankId, bank.bankId) &&
        Objects.equals(this.center, bank.center) &&
        Objects.equals(this.logo, bank.logo) &&
        Objects.equals(this.status, bank.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, bic, typeRefresh, oldestTransactionDate, lastRequestDateTime, contactPoint, bankId, center, logo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    typeRefresh: ").append(toIndentedString(typeRefresh)).append("\n");
    sb.append("    oldestTransactionDate: ").append(toIndentedString(oldestTransactionDate)).append("\n");
    sb.append("    lastRequestDateTime: ").append(toIndentedString(lastRequestDateTime)).append("\n");
    sb.append("    contactPoint: ").append(toIndentedString(contactPoint)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

