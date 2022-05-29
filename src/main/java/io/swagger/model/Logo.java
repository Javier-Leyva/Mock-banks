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
 * Data structure containing information about a logo (image).
 */
@ApiModel(description = "Data structure containing information about a logo (image).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T11:56:28.354Z")


public class Logo   {
  @JsonProperty("URL")
  private String URL = null;

  public Logo URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL where the logo is available.
   * @return URL
  **/
  @ApiModelProperty(example = "https://servidor/logo.jpg", value = "URL where the logo is available.")


  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logo logo = (Logo) o;
    return Objects.equals(this.URL, logo.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logo {\n");
    
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

