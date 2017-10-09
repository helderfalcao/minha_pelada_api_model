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

/**
 * Block
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T21:46:26.435-03:00")
public class Block {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("idAdmin")
  private String idAdmin = null;

  @SerializedName("idCompany")
  private String idCompany = null;

  @SerializedName("status")
  private String status = null;

  public Block id(String id) {
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

  public Block nome(String nome) {
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

  public Block idAdmin(String idAdmin) {
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

  public Block idCompany(String idCompany) {
    this.idCompany = idCompany;
    return this;
  }

   /**
   * Get idCompany
   * @return idCompany
  **/
  @ApiModelProperty(value = "")
  public String getIdCompany() {
    return idCompany;
  }

  public void setIdCompany(String idCompany) {
    this.idCompany = idCompany;
  }

  public Block status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Block Status
   * @return status
  **/
  @ApiModelProperty(value = "Block Status")
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
    Block block = (Block) o;
    return Objects.equals(this.id, block.id) &&
        Objects.equals(this.nome, block.nome) &&
        Objects.equals(this.idAdmin, block.idAdmin) &&
        Objects.equals(this.idCompany, block.idCompany) &&
        Objects.equals(this.status, block.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, idAdmin, idCompany, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idAdmin: ").append(toIndentedString(idAdmin)).append("\n");
    sb.append("    idCompany: ").append(toIndentedString(idCompany)).append("\n");
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

