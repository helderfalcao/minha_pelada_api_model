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
import java.util.ArrayList;
import java.util.List;

/**
 * Group
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T18:18:21.776-02:00")
public class Group {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dayOfWeek")
  private String dayOfWeek = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("idIntegrantes")
  private List<String> idIntegrantes = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("idAdmin")
  private String idAdmin = null;

  public Group id(String id) {
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

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")
  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public Group time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Group idIntegrantes(List<String> idIntegrantes) {
    this.idIntegrantes = idIntegrantes;
    return this;
  }

  public Group addIdIntegrantesItem(String idIntegrantesItem) {
    if (this.idIntegrantes == null) {
      this.idIntegrantes = new ArrayList<String>();
    }
    this.idIntegrantes.add(idIntegrantesItem);
    return this;
  }

   /**
   * Get idIntegrantes
   * @return idIntegrantes
  **/
  @ApiModelProperty(value = "")
  public List<String> getIdIntegrantes() {
    return idIntegrantes;
  }

  public void setIdIntegrantes(List<String> idIntegrantes) {
    this.idIntegrantes = idIntegrantes;
  }

  public Group status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status do grupo
   * @return status
  **/
  @ApiModelProperty(value = "Status do grupo")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Group idAdmin(String idAdmin) {
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
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.dayOfWeek, group.dayOfWeek) &&
        Objects.equals(this.time, group.time) &&
        Objects.equals(this.idIntegrantes, group.idIntegrantes) &&
        Objects.equals(this.status, group.status) &&
        Objects.equals(this.idAdmin, group.idAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dayOfWeek, time, idIntegrantes, status, idAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    idIntegrantes: ").append(toIndentedString(idIntegrantes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

