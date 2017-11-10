package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Match;
import io.swagger.client.model.MatchSkeleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MatchApi {
  /**
   * Retorna as partidas dos grupos
   * Retorna as partidas de um determinado grupo/grupos informados que o usuaário tenha acesso
   * @return Call&lt;Match&gt;
   */
  @GET("match")
  Call<Match> getMatch();
    

  /**
   * Retorna os skeletons de partida do usuário
   * Retorna as estruturas de partidas que o usuário possui registrado
   * @return Call&lt;MatchSkeleton&gt;
   */
  @GET("matchSkeleton")
  Call<MatchSkeleton> getMatchSkeleton();
    

  /**
   * Salva uma nova parida para o grupo
   * Permite salvar uma nova partida para um determinado grupo
   * @return Call&lt;Match&gt;
   */
  @POST("match")
  Call<Match> postMatch();
    

  /**
   * Salva uma nova estrutura de partidas
   * Permite salvar uma nova estrutua de partidas
   * @return Call&lt;MatchSkeleton&gt;
   */
  @POST("matchSkeleton")
  Call<MatchSkeleton> postMatchSkeleton();
    

  /**
   * Atualizar uma estrutura de partidas
   * Um usuário que já criou um skeleton de partidas poderá atualizar o mesmo independentemente de existirem partidas criadas com essa estrutura ou não
   * @return Call&lt;MatchSkeleton&gt;
   */
  @PUT("matchSkeleton")
  Call<MatchSkeleton> putMatchSkeleton();
    

}
