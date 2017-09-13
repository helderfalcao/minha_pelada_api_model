package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CompanyApi {
  /**
   * Retorna grupos gerenciadores de quadras
   * Retorna grupos organizadores de quadras de acordo com a query informada
   * @return Call&lt;Company&gt;
   */
  @GET("company")
  Call<Company> getCompany();
    

  /**
   * Permite salvar um novo grupo de quadras
   * Salva um novo grupo de organização de quadras, estes grupos demitem o gerenciamente centralizado de administradores
   * @return Call&lt;Company&gt;
   */
  @POST("company")
  Call<Company> postCompany();
    

  /**
   * Atualiza o grupo organizador
   * Permite a atualização do grupo organizador pelo usuário criador
   * @return Call&lt;Company&gt;
   */
  @PUT("company")
  Call<Company> putCompany();
    

}
