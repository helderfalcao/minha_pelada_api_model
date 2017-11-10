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
 * InlineResponse2007
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T14:44:58.749-02:00")
public class InlineResponse2007 {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("idAdmin")
  private String idAdmin = null;

  @SerializedName("idBlocks")
  private List<String> idBlocks = null;

  @SerializedName("status")
  private String status = null;

  public InlineResponse2007 id(String id) {
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

  public InlineResponse2007 nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public InlineResponse2007 idAdmin(String idAdmin) {
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

  public InlineResponse2007 idBlocks(List<String> idBlocks) {
    this.idBlocks = idBlocks;
    return this;
  }

  public InlineResponse2007 addIdBlocksItem(String idBlocksItem) {
    if (this.idBlocks == null) {
      this.idBlocks = new ArrayList<String>();
    }
    this.idBlocks.add(idBlocksItem);
    return this;
  }

   /**
   * Get idBlocks
   * @return idBlocks
  **/
  @ApiModelProperty(value = "")
  public List<String> getIdBlocks() {
    return idBlocks;
  }

  public void setIdBlocks(List<String> idBlocks) {
    this.idBlocks = idBlocks;
  }

  public InlineResponse2007 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Company Status
   * @return status
  **/
  @ApiModelProperty(value = "Company Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.id, inlineResponse2007.id) &&
        Objects.equals(this.nome, inlineResponse2007.nome) &&
        Objects.equals(this.idAdmin, inlineResponse2007.idAdmin) &&
        Objects.equals(this.idBlocks, inlineResponse2007.idBlocks) &&
        Objects.equals(this.status, inlineResponse2007.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, idAdmin, idBlocks, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idAdmin: ").append(toIndentedString(idAdmin)).append("\n");
    sb.append("    idBlocks: ").append(toIndentedString(idBlocks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

