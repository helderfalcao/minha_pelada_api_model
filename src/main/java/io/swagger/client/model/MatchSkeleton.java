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
import org.threeten.bp.LocalDate;

/**
 * MatchSkeleton
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-10T18:18:21.776-02:00")
public class MatchSkeleton {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("diaSemana")
  private Integer diaSemana = null;

  @SerializedName("horario")
  private LocalDate horario = null;

  @SerializedName("idIntegrantes")
  private List<String> idIntegrantes = null;

  /**
   * Status do grupo
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ATIVO("ativo"),
    
    INATIVO("inativo"),
    
    REMOVIDO("removido");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("idAdmin")
  private String idAdmin = null;

  public MatchSkeleton id(String id) {
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

  public MatchSkeleton nome(String nome) {
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

  public MatchSkeleton diaSemana(Integer diaSemana) {
    this.diaSemana = diaSemana;
    return this;
  }

   /**
   * Get diaSemana
   * @return diaSemana
  **/
  @ApiModelProperty(value = "")
  public Integer getDiaSemana() {
    return diaSemana;
  }

  public void setDiaSemana(Integer diaSemana) {
    this.diaSemana = diaSemana;
  }

  public MatchSkeleton horario(LocalDate horario) {
    this.horario = horario;
    return this;
  }

   /**
   * Get horario
   * @return horario
  **/
  @ApiModelProperty(value = "")
  public LocalDate getHorario() {
    return horario;
  }

  public void setHorario(LocalDate horario) {
    this.horario = horario;
  }

  public MatchSkeleton idIntegrantes(List<String> idIntegrantes) {
    this.idIntegrantes = idIntegrantes;
    return this;
  }

  public MatchSkeleton addIdIntegrantesItem(String idIntegrantesItem) {
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

  public MatchSkeleton status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status do grupo
   * @return status
  **/
  @ApiModelProperty(value = "Status do grupo")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MatchSkeleton idAdmin(String idAdmin) {
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
    MatchSkeleton matchSkeleton = (MatchSkeleton) o;
    return Objects.equals(this.id, matchSkeleton.id) &&
        Objects.equals(this.nome, matchSkeleton.nome) &&
        Objects.equals(this.diaSemana, matchSkeleton.diaSemana) &&
        Objects.equals(this.horario, matchSkeleton.horario) &&
        Objects.equals(this.idIntegrantes, matchSkeleton.idIntegrantes) &&
        Objects.equals(this.status, matchSkeleton.status) &&
        Objects.equals(this.idAdmin, matchSkeleton.idAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, diaSemana, horario, idIntegrantes, status, idAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchSkeleton {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    diaSemana: ").append(toIndentedString(diaSemana)).append("\n");
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
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

