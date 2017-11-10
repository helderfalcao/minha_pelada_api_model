package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MatchSkeletonApi {
  /**
   * Retorna os skeletons de partida do usuário
   * Retorna as estruturas de partidas que o usuário possui registrado
   * @return Call&lt;InlineResponse2002&gt;
   */
  @GET("matchSkeleton")
  Call<InlineResponse2002> getMatchSkeleton();
    

  /**
   * Salva uma nova estrutura de partidas
   * Permite salvar uma nova estrutua de partidas
   * @return Call&lt;InlineResponse2002&gt;
   */
  @POST("matchSkeleton")
  Call<InlineResponse2002> postMatchSkeleton();
    

  /**
   * Atualizar uma estrutura de partidas
   * Um usuário que já criou um skeleton de partidas poderá atualizar o mesmo independentemente de existirem partidas criadas com essa estrutura ou não
   * @return Call&lt;InlineResponse2002&gt;
   */
  @PUT("matchSkeleton")
  Call<InlineResponse2002> putMatchSkeleton();
    

}
