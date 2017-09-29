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
import java.util.ArrayList;
import java.util.List;

/**
 * Match
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-29T18:02:36.536-03:00")
public class Match {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("idMatchSkeleton")
  private String idMatchSkeleton = null;

  @SerializedName("idPartidas")
  private List<String> idPartidas = null;

  @SerializedName("idGastos")
  private List<String> idGastos = null;

  @SerializedName("idParticipantes")
  private List<String> idParticipantes = null;

  @SerializedName("idAdmin")
  private String idAdmin = null;

  public Match id(String id) {
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

  public Match idMatchSkeleton(String idMatchSkeleton) {
    this.idMatchSkeleton = idMatchSkeleton;
    return this;
  }

   /**
   * Get idMatchSkeleton
   * @return idMatchSkeleton
  **/
  @ApiModelProperty(value = "")
  public String getIdMatchSkeleton() {
    return idMatchSkeleton;
  }

  public void setIdMatchSkeleton(String idMatchSkeleton) {
    this.idMatchSkeleton = idMatchSkeleton;
  }

  public Match idPartidas(List<String> idPartidas) {
    this.idPartidas = idPartidas;
    return this;
  }

  public Match addIdPartidasItem(String idPartidasItem) {
    if (this.idPartidas == null) {
      this.idPartidas = new ArrayList<String>();
    }
    this.idPartidas.add(idPartidasItem);
    return this;
  }

   /**
   * Get idPartidas
   * @return idPartidas
  **/
  @ApiModelProperty(value = "")
  public List<String> getIdPartidas() {
    return idPartidas;
  }

  public void setIdPartidas(List<String> idPartidas) {
    this.idPartidas = idPartidas;
  }

  public Match idGastos(List<String> idGastos) {
    this.idGastos = idGastos;
    return this;
  }

  public Match addIdGastosItem(String idGastosItem) {
    if (this.idGastos == null) {
      this.idGastos = new ArrayList<String>();
    }
    this.idGastos.add(idGastosItem);
    return this;
  }

   /**
   * Get idGastos
   * @return idGastos
  **/
  @ApiModelProperty(value = "")
  public List<String> getIdGastos() {
    return idGastos;
  }

  public void setIdGastos(List<String> idGastos) {
    this.idGastos = idGastos;
  }

  public Match idParticipantes(List<String> idParticipantes) {
    this.idParticipantes = idParticipantes;
    return this;
  }

  public Match addIdParticipantesItem(String idParticipantesItem) {
    if (this.idParticipantes == null) {
      this.idParticipantes = new ArrayList<String>();
    }
    this.idParticipantes.add(idParticipantesItem);
    return this;
  }

   /**
   * Get idParticipantes
   * @return idParticipantes
  **/
  @ApiModelProperty(value = "")
  public List<String> getIdParticipantes() {
    return idParticipantes;
  }

  public void setIdParticipantes(List<String> idParticipantes) {
    this.idParticipantes = idParticipantes;
  }

  public Match idAdmin(String idAdmin) {
    this.idAdmin = idAdmin;
    return this;
  }

   /**
   * Get idAdmin
   * @return idAdmin
  **/
  @ApiModelProperty(value = "")
  public String getIdAdmin() {
    return idAdmin;
  }

  public void setIdAdmin(String idAdmin) {
    this.idAdmin = idAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.id, match.id) &&
        Objects.equals(this.idMatchSkeleton, match.idMatchSkeleton) &&
        Objects.equals(this.idPartidas, match.idPartidas) &&
        Objects.equals(this.idGastos, match.idGastos) &&
        Objects.equals(this.idParticipantes, match.idParticipantes) &&
        Objects.equals(this.idAdmin, match.idAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idMatchSkeleton, idPartidas, idGastos, idParticipantes, idAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idMatchSkeleton: ").append(toIndentedString(idMatchSkeleton)).append("\n");
    sb.append("    idPartidas: ").append(toIndentedString(idPartidas)).append("\n");
    sb.append("    idGastos: ").append(toIndentedString(idGastos)).append("\n");
    sb.append("    idParticipantes: ").append(toIndentedString(idParticipantes)).append("\n");
    sb.append("    idAdmin: ").append(toIndentedString(idAdmin)).append("\n");
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

