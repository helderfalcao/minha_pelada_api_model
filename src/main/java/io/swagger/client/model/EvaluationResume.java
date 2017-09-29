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
 * EvaluationResume
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-29T19:49:20.357-03:00")
public class EvaluationResume {
  @SerializedName("idUserEvaluated")
  private String idUserEvaluated = null;

  @SerializedName("valueResumed")
  private BigDecimal valueResumed = null;

  public EvaluationResume idUserEvaluated(String idUserEvaluated) {
    this.idUserEvaluated = idUserEvaluated;
    return this;
  }

   /**
   * Get idUserEvaluated
   * @return idUserEvaluated
  **/
  @ApiModelProperty(value = "")
  public String getIdUserEvaluated() {
    return idUserEvaluated;
  }

  public void setIdUserEvaluated(String idUserEvaluated) {
    this.idUserEvaluated = idUserEvaluated;
  }

  public EvaluationResume valueResumed(BigDecimal valueResumed) {
    this.valueResumed = valueResumed;
    return this;
  }

   /**
   * Get valueResumed
   * @return valueResumed
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getValueResumed() {
    return valueResumed;
  }

  public void setValueResumed(BigDecimal valueResumed) {
    this.valueResumed = valueResumed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationResume evaluationResume = (EvaluationResume) o;
    return Objects.equals(this.idUserEvaluated, evaluationResume.idUserEvaluated) &&
        Objects.equals(this.valueResumed, evaluationResume.valueResumed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUserEvaluated, valueResumed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationResume {\n");
    
    sb.append("    idUserEvaluated: ").append(toIndentedString(idUserEvaluated)).append("\n");
    sb.append("    valueResumed: ").append(toIndentedString(valueResumed)).append("\n");
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

