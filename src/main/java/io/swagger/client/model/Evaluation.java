/*
 * Minha Pelada API
 * Servico para controle de grupos relacionados à pratica de esportes.  
 *
 * OpenAPI spec version: 1.5.7
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

/**
 * Evaluation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T20:37:37.884-02:00")
public class Evaluation {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("idCriterio")
  private String idCriterio = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("value")
  private Integer value = null;

  @SerializedName("idEvaluated")
  private String idEvaluated = null;

  @SerializedName("idMeasurer")
  private String idMeasurer = null;

  public Evaluation id(String id) {
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

  public Evaluation idCriterio(String idCriterio) {
    this.idCriterio = idCriterio;
    return this;
  }

   /**
   * Get idCriterio
   * @return idCriterio
  **/
  @ApiModelProperty(value = "")
  public String getIdCriterio() {
    return idCriterio;
  }

  public void setIdCriterio(String idCriterio) {
    this.idCriterio = idCriterio;
  }

  public Evaluation alias(String alias) {
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

  public Evaluation value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Evaluation idEvaluated(String idEvaluated) {
    this.idEvaluated = idEvaluated;
    return this;
  }

   /**
   * Get idEvaluated
   * @return idEvaluated
  **/
  @ApiModelProperty(value = "")
  public String getIdEvaluated() {
    return idEvaluated;
  }

  public void setIdEvaluated(String idEvaluated) {
    this.idEvaluated = idEvaluated;
  }

  public Evaluation idMeasurer(String idMeasurer) {
    this.idMeasurer = idMeasurer;
    return this;
  }

   /**
   * Get idMeasurer
   * @return idMeasurer
  **/
  @ApiModelProperty(value = "")
  public String getIdMeasurer() {
    return idMeasurer;
  }

  public void setIdMeasurer(String idMeasurer) {
    this.idMeasurer = idMeasurer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(this.id, evaluation.id) &&
        Objects.equals(this.idCriterio, evaluation.idCriterio) &&
        Objects.equals(this.alias, evaluation.alias) &&
        Objects.equals(this.value, evaluation.value) &&
        Objects.equals(this.idEvaluated, evaluation.idEvaluated) &&
        Objects.equals(this.idMeasurer, evaluation.idMeasurer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCriterio, alias, value, idEvaluated, idMeasurer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCriterio: ").append(toIndentedString(idCriterio)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    idEvaluated: ").append(toIndentedString(idEvaluated)).append("\n");
    sb.append("    idMeasurer: ").append(toIndentedString(idMeasurer)).append("\n");
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

