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
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("user")
  Call<List<User>> getUser();
    

  /**
   * Retorna usuários de um determinado grupo
   * Retorna usuários registrados no sistema que pertencem ao id do grupo informado
   * @param groupId ID do grupo que terão os usuário retornados (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("user/{groupId}")
  Call<List<User>> getUserByGroup(
    @retrofit2.http.Path("groupId") String groupId
  );

  /**
   * Salva usuário de acordo com os dados informados na autenticação
   * Permite salvar um novo usuário autenticado
   * @param userIds Ids dos usuários a serem consultados (required)
   * @return Call&lt;User&gt;
   */
  @POST("userList")
  Call<User> getUserByIds(
    @retrofit2.http.Body List<User> userIds
  );

  /**
   * Retorna os usuário de acordo com a lista de ids informada na requisição
   * Retorna usuários registrados no sistema de acordo com a pesquisa
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @POST("user")
  Call<List<User>> postUser();
    

  /**
   * Atualize um usuário registrado no sistema(Somente permitido para o próprio usuário)
   * Permite o usuário atualizar seus dados pessoais
   * @return Call&lt;User&gt;
   */
  @PUT("user")
  Call<User> putUser();
    

}
