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
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T14:44:58.749-02:00")
public class InlineResponse2003 {
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

  public InlineResponse2003 id(String id) {
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

  public InlineResponse2003 idMatchSkeleton(String idMatchSkeleton) {
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

  public InlineResponse2003 idPartidas(List<String> idPartidas) {
    this.idPartidas = idPartidas;
    return this;
  }

  public InlineResponse2003 addIdPartidasItem(String idPartidasItem) {
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

  public InlineResponse2003 idGastos(List<String> idGastos) {
    this.idGastos = idGastos;
    return this;
  }

  public InlineResponse2003 addIdGastosItem(String idGastosItem) {
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

  public InlineResponse2003 idParticipantes(List<String> idParticipantes) {
    this.idParticipantes = idParticipantes;
    return this;
  }

  public InlineResponse2003 addIdParticipantesItem(String idParticipantesItem) {
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

  public InlineResponse2003 idAdmin(String idAdmin) {
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
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.id, inlineResponse2003.id) &&
        Objects.equals(this.idMatchSkeleton, inlineResponse2003.idMatchSkeleton) &&
        Objects.equals(this.idPartidas, inlineResponse2003.idPartidas) &&
        Objects.equals(this.idGastos, inlineResponse2003.idGastos) &&
        Objects.equals(this.idParticipantes, inlineResponse2003.idParticipantes) &&
        Objects.equals(this.idAdmin, inlineResponse2003.idAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idMatchSkeleton, idPartidas, idGastos, idParticipantes, idAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
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

