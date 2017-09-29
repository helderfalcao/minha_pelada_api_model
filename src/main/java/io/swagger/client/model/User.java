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
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-29T19:22:00.528-03:00")
public class User {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("tokenGoogle")
  private String tokenGoogle = null;

  @SerializedName("tokenFacebook")
  private String tokenFacebook = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("foto")
  private String foto = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("senha")
  private String senha = null;

  @SerializedName("telefone")
  private String telefone = null;

  @SerializedName("evaluated")
  private Boolean evaluated = null;

  @SerializedName("status")
  private String status = null;

  public User id(String id) {
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

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User tokenGoogle(String tokenGoogle) {
    this.tokenGoogle = tokenGoogle;
    return this;
  }

   /**
   * Get tokenGoogle
   * @return tokenGoogle
  **/
  @ApiModelProperty(value = "")
  public String getTokenGoogle() {
    return tokenGoogle;
  }

  public void setTokenGoogle(String tokenGoogle) {
    this.tokenGoogle = tokenGoogle;
  }

  public User tokenFacebook(String tokenFacebook) {
    this.tokenFacebook = tokenFacebook;
    return this;
  }

   /**
   * Get tokenFacebook
   * @return tokenFacebook
  **/
  @ApiModelProperty(value = "")
  public String getTokenFacebook() {
    return tokenFacebook;
  }

  public void setTokenFacebook(String tokenFacebook) {
    this.tokenFacebook = tokenFacebook;
  }

  public User nome(String nome) {
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

  public User foto(String foto) {
    this.foto = foto;
    return this;
  }

   /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(value = "")
  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Get senha
   * @return senha
  **/
  @ApiModelProperty(value = "")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public User telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

   /**
   * Get telefone
   * @return telefone
  **/
  @ApiModelProperty(value = "")
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public User evaluated(Boolean evaluated) {
    this.evaluated = evaluated;
    return this;
  }

   /**
   * Get evaluated
   * @return evaluated
  **/
  @ApiModelProperty(value = "")
  public Boolean isEvaluated() {
    return evaluated;
  }

  public void setEvaluated(Boolean evaluated) {
    this.evaluated = evaluated;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

   /**
   * User Status
   * @return status
  **/
  @ApiModelProperty(value = "User Status")
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.tokenGoogle, user.tokenGoogle) &&
        Objects.equals(this.tokenFacebook, user.tokenFacebook) &&
        Objects.equals(this.nome, user.nome) &&
        Objects.equals(this.foto, user.foto) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.senha, user.senha) &&
        Objects.equals(this.telefone, user.telefone) &&
        Objects.equals(this.evaluated, user.evaluated) &&
        Objects.equals(this.status, user.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, tokenGoogle, tokenFacebook, nome, foto, email, senha, telefone, evaluated, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    tokenGoogle: ").append(toIndentedString(tokenGoogle)).append("\n");
    sb.append("    tokenFacebook: ").append(toIndentedString(tokenFacebook)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    evaluated: ").append(toIndentedString(evaluated)).append("\n");
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

