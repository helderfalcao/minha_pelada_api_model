/*
 * Minha Pelada API
 * Servico para controle de grupos relacionados à pratica de esportes.  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: helderfalcaob@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EvaluationSummaryUnit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-15T18:22:52.309-02:00")
public class EvaluationSummaryUnit {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("average")
  private BigDecimal average = null;

  @SerializedName("alias")
  private String alias = null;

  public EvaluationSummaryUnit id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EvaluationSummaryUnit average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public EvaluationSummaryUnit alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSummaryUnit evaluationSummaryUnit = (EvaluationSummaryUnit) o;
    return Objects.equals(this.id, evaluationSummaryUnit.id) &&
        Objects.equals(this.average, evaluationSummaryUnit.average) &&
        Objects.equals(this.alias, evaluationSummaryUnit.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, average, alias);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSummaryUnit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

