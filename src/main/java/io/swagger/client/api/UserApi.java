package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UserApi {
  /**
   * Retorna usuários de acordo com os dados informados na query
   * Retorna usuários registrados no sistema de acordo com a pesquisa
   * @return Call&lt;User&gt;
   */
  @GET("user")
  Call<User> getUser();
    

  /**
   * Retorna usuários de um determinado grupo
   * Retorna usuários registrados no sistema que pertencem ao id do grupo informado
   * @param groupId ID do grupo que terão os usuário retornados (required)
   * @return Call&lt;User&gt;
   */
  @GET("user/{groupId}")
  Call<User> getUserByGroup(
    @retrofit2.http.Path("groupId") String groupId
  );

  /**
   * Salva usuário de acordo com os dados informados na autenticação
   * Permite salvar um novo usuário autenticado
   * @return Call&lt;User&gt;
   */
  @POST("user")
  Call<User> postUser();
    

  /**
   * Atualize um usuário registrado no sistema(Somente permitido para o próprio usuário)
   * Permite o usuário atualizar seus dados pessoais
   * @return Call&lt;User&gt;
   */
  @PUT("user")
  Call<User> putUser();
    

}
