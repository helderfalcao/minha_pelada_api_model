package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Match;

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
   * Salva uma nova parida para o grupo
   * Permite salvar uma nova partida para um determinado grupo
   * @return Call&lt;Match&gt;
   */
  @POST("match")
  Call<Match> postMatch();
    

}
