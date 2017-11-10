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
import io.swagger.client.model.InlineResponse20010AverageSummaryEvaluationValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T14:44:58.749-02:00")
public class InlineResponse20010 {
  @SerializedName("averageEvaluationValue")
  private BigDecimal averageEvaluationValue = null;

  @SerializedName("averageSummaryEvaluationValue")
  private List<InlineResponse20010AverageSummaryEvaluationValue> averageSummaryEvaluationValue = null;

  @SerializedName("bestEvaluation")
  private InlineResponse20010AverageSummaryEvaluationValue bestEvaluation = null;

  @SerializedName("worstEvaluation")
  private InlineResponse20010AverageSummaryEvaluationValue worstEvaluation = null;

  public InlineResponse20010 averageEvaluationValue(BigDecimal averageEvaluationValue) {
    this.averageEvaluationValue = averageEvaluationValue;
    return this;
  }

   /**
   * Get averageEvaluationValue
   * @return averageEvaluationValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAverageEvaluationValue() {
    return averageEvaluationValue;
  }

  public void setAverageEvaluationValue(BigDecimal averageEvaluationValue) {
    this.averageEvaluationValue = averageEvaluationValue;
  }

  public InlineResponse20010 averageSummaryEvaluationValue(List<InlineResponse20010AverageSummaryEvaluationValue> averageSummaryEvaluationValue) {
    this.averageSummaryEvaluationValue = averageSummaryEvaluationValue;
    return this;
  }

  public InlineResponse20010 addAverageSummaryEvaluationValueItem(InlineResponse20010AverageSummaryEvaluationValue averageSummaryEvaluationValueItem) {
    if (this.averageSummaryEvaluationValue == null) {
      this.averageSummaryEvaluationValue = new ArrayList<InlineResponse20010AverageSummaryEvaluationValue>();
    }
    this.averageSummaryEvaluationValue.add(averageSummaryEvaluationValueItem);
    return this;
  }

   /**
   * Get averageSummaryEvaluationValue
   * @return averageSummaryEvaluationValue
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20010AverageSummaryEvaluationValue> getAverageSummaryEvaluationValue() {
    return averageSummaryEvaluationValue;
  }

  public void setAverageSummaryEvaluationValue(List<InlineResponse20010AverageSummaryEvaluationValue> averageSummaryEvaluationValue) {
    this.averageSummaryEvaluationValue = averageSummaryEvaluationValue;
  }

  public InlineResponse20010 bestEvaluation(InlineResponse20010AverageSummaryEvaluationValue bestEvaluation) {
    this.bestEvaluation = bestEvaluation;
    return this;
  }

   /**
   * Get bestEvaluation
   * @return bestEvaluation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20010AverageSummaryEvaluationValue getBestEvaluation() {
    return bestEvaluation;
  }

  public void setBestEvaluation(InlineResponse20010AverageSummaryEvaluationValue bestEvaluation) {
    this.bestEvaluation = bestEvaluation;
  }

  public InlineResponse20010 worstEvaluation(InlineResponse20010AverageSummaryEvaluationValue worstEvaluation) {
    this.worstEvaluation = worstEvaluation;
    return this;
  }

   /**
   * Get worstEvaluation
   * @return worstEvaluation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20010AverageSummaryEvaluationValue getWorstEvaluation() {
    return worstEvaluation;
  }

  public void setWorstEvaluation(InlineResponse20010AverageSummaryEvaluationValue worstEvaluation) {
    this.worstEvaluation = worstEvaluation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.averageEvaluationValue, inlineResponse20010.averageEvaluationValue) &&
        Objects.equals(this.averageSummaryEvaluationValue, inlineResponse20010.averageSummaryEvaluationValue) &&
        Objects.equals(this.bestEvaluation, inlineResponse20010.bestEvaluation) &&
        Objects.equals(this.worstEvaluation, inlineResponse20010.worstEvaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageEvaluationValue, averageSummaryEvaluationValue, bestEvaluation, worstEvaluation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    averageEvaluationValue: ").append(toIndentedString(averageEvaluationValue)).append("\n");
    sb.append("    averageSummaryEvaluationValue: ").append(toIndentedString(averageSummaryEvaluationValue)).append("\n");
    sb.append("    bestEvaluation: ").append(toIndentedString(bestEvaluation)).append("\n");
    sb.append("    worstEvaluation: ").append(toIndentedString(worstEvaluation)).append("\n");
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
