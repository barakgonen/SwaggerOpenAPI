package com.abc.code.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Velocity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-30T11:39:02.671811-08:00[America/Los_Angeles]")

public class Velocity   {
  @JsonProperty("vx")
  private BigDecimal vx;

  @JsonProperty("vy")
  private BigDecimal vy;

  @JsonProperty("vz")
  private BigDecimal vz;

  public Velocity vx(BigDecimal vx) {
    this.vx = vx;
    return this;
  }

  /**
   * Get vx
   * @return vx
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getVx() {
    return vx;
  }

  public void setVx(BigDecimal vx) {
    this.vx = vx;
  }

  public Velocity vy(BigDecimal vy) {
    this.vy = vy;
    return this;
  }

  /**
   * Get vy
   * @return vy
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getVy() {
    return vy;
  }

  public void setVy(BigDecimal vy) {
    this.vy = vy;
  }

  public Velocity vz(BigDecimal vz) {
    this.vz = vz;
    return this;
  }

  /**
   * Get vz
   * @return vz
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getVz() {
    return vz;
  }

  public void setVz(BigDecimal vz) {
    this.vz = vz;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Velocity velocity = (Velocity) o;
    return Objects.equals(this.vx, velocity.vx) &&
        Objects.equals(this.vy, velocity.vy) &&
        Objects.equals(this.vz, velocity.vz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vx, vy, vz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Velocity {\n");
    
    sb.append("    vx: ").append(toIndentedString(vx)).append("\n");
    sb.append("    vy: ").append(toIndentedString(vy)).append("\n");
    sb.append("    vz: ").append(toIndentedString(vz)).append("\n");
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

