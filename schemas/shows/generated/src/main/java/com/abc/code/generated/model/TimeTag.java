package com.abc.code.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-30T11:39:02.671811-08:00[America/Los_Angeles]")

public class TimeTag   {
  @JsonProperty("code")
  private Long code;

  @JsonProperty("millis")
  private Integer millis;

  public TimeTag code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public TimeTag millis(Integer millis) {
    this.millis = millis;
    return this;
  }

  /**
   * Get millis
   * @return millis
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getMillis() {
    return millis;
  }

  public void setMillis(Integer millis) {
    this.millis = millis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTag timeTag = (TimeTag) o;
    return Objects.equals(this.code, timeTag.code) &&
        Objects.equals(this.millis, timeTag.millis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, millis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTag {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
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

