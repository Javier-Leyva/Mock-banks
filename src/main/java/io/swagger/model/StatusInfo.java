package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about the status of an item
 */
@ApiModel(description = "Data structure containing information about the status of an item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class StatusInfo   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("statusDescription")
  private String statusDescription = null;

  @JsonProperty("statusDateTime")
  private OffsetDateTime statusDateTime = null;

  public StatusInfo statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status code
   * @return statusCode
  **/
  @ApiModelProperty(example = "CANC", value = "Status code")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public StatusInfo statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

  /**
   * Status description
   * @return statusDescription
  **/
  @ApiModelProperty(example = "Cancelled", value = "Status description")


  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public StatusInfo statusDateTime(OffsetDateTime statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

  /**
   * Date and time when the status was established.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DDThh:mm:ss.sssTZD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31) - hh: 2-digit hour of the day (00 through 23) - mm: 2-digit minute of the hour (00 through 59) - ss.sss: 5-digit seconds and milliseconds, separated by a point - TZD: Time zone indicator
   * @return statusDateTime
  **/
  @ApiModelProperty(example = "1998-03-14T17:32:28.123Z", value = "Date and time when the status was established.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DDThh:mm:ss.sssTZD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31) - hh: 2-digit hour of the day (00 through 23) - mm: 2-digit minute of the hour (00 through 59) - ss.sss: 5-digit seconds and milliseconds, separated by a point - TZD: Time zone indicator")

  @Valid

  public OffsetDateTime getStatusDateTime() {
    return statusDateTime;
  }

  public void setStatusDateTime(OffsetDateTime statusDateTime) {
    this.statusDateTime = statusDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusInfo statusInfo = (StatusInfo) o;
    return Objects.equals(this.statusCode, statusInfo.statusCode) &&
        Objects.equals(this.statusDescription, statusInfo.statusDescription) &&
        Objects.equals(this.statusDateTime, statusInfo.statusDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusDescription, statusDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfo {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
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

