package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Block;
import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BlockApi {
  /**
   * Retorna as quadras de acordo com a query informada
   * As quadras registradas no sistema por donos permitidos pelo sistema são consultadas e retornadas pela consulta dos usuários
   * @return Call&lt;Block&gt;
   */
  @GET("block")
  Call<Block> getBlock();
    

  /**
   * Permite salvar uma nova quadra
   * Salva a quadra registrada pelo usuário que possui permissão para registro desta entidade no sistema
   * @return Call&lt;Block&gt;
   */
  @POST("block")
  Call<Block> postBlock();
    

  /**
   * Atualiza a quadra
   * Permite a atualização da quadra pelo usuário que criou a mesma
   * @return Call&lt;User&gt;
   */
  @PUT("block")
  Call<User> putMatch();
    

}
