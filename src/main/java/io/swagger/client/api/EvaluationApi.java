package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Evaluation;
import io.swagger.client.model.EvaluationResume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface EvaluationApi {
  /**
   * Retorna avaliações geradas por usuário registrados no sistema
   * Retorna as avaliações dos usuários que o usuário que consulta tem acesso
   * @param userEvaluatedId ID do usuário sendo avaliado (required)
   * @return Call&lt;List&lt;Evaluation&gt;&gt;
   */
  @GET("evaluation/{userEvaluatedId}")
  Call<List<Evaluation>> getEvaluation(
    @retrofit2.http.Path("userEvaluatedId") String userEvaluatedId
  );

  /**
   * Retorna avaliações resumo dos jogadores informados
   * Todos os jogadores tem determinadas características que são avaliadas por cada um dos seus colegas de partida, estas avaliações podem ser consultadas de forma resumida neste item
   * @param usersEvaluatedId IDs dos usuários a ser consultado o resumo (required)
   * @return Call&lt;List&lt;EvaluationResume&gt;&gt;
   */
  @POST("evaluationResumed")
  Call<List<EvaluationResume>> getUsersEvaluationResumed(
    @retrofit2.http.Body List<String> usersEvaluatedId
  );

  /**
   * Permite salvar uma nova avaliação
   * Permite um usuário salvar uma nova avaliação de um usuário registrado em um de seus grupos
   * @param userEvaluatedId ID do usuário sendo avaliado (required)
   * @param evaluations  (required)
   * @return Call&lt;Evaluation&gt;
   */
  @POST("evaluation/{userEvaluatedId}")
  Call<Evaluation> postEvaluation(
    @retrofit2.http.Path("userEvaluatedId") String userEvaluatedId, @retrofit2.http.Body List<Evaluation> evaluations
  );

  /**
   * Atualiza uma avaliação já registrada
   * Um usuário que já registrou a sua avaliação pode atualizar a mesma caso ache necessário uma nova recomendação para o usuário avaliado
   * @param userEvaluatedId ID do usuário sendo avaliado (required)
   * @param evaluations  (required)
   * @return Call&lt;Evaluation&gt;
   */
  @PUT("evaluation/{userEvaluatedId}")
  Call<Evaluation> putEvaluation(
    @retrofit2.http.Path("userEvaluatedId") String userEvaluatedId, @retrofit2.http.Body List<Evaluation> evaluations
  );

}
