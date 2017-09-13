package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Evaluation;
import io.swagger.client.model.EvaluationResume;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EvaluationApi
 */
public class EvaluationApiTest {

    private EvaluationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EvaluationApi.class);
    }

    /**
     * Retorna avaliações geradas por usuário registrados no sistema
     *
     * Retorna as avaliações dos usuários que o usuário que consulta tem acesso
     */
    @Test
    public void getEvaluationTest() {
        String userEvaluatedId = null;
        // List<Evaluation> response = api.getEvaluation(userEvaluatedId);

        // TODO: test validations
    }
    /**
     * Retorna avaliações resumo dos jogadores informados
     *
     * Todos os jogadores tem determinadas características que são avaliadas por cada um dos seus colegas de partida, estas avaliações podem ser consultadas de forma resumida neste item
     */
    @Test
    public void getUsersEvaluationResumedTest() {
        List<String> usersEvaluatedId = null;
        // List<EvaluationResume> response = api.getUsersEvaluationResumed(usersEvaluatedId);

        // TODO: test validations
    }
    /**
     * Permite salvar uma nova avaliação
     *
     * Permite um usuário salvar uma nova avaliação de um usuário registrado em um de seus grupos
     */
    @Test
    public void postEvaluationTest() {
        String userEvaluatedId = null;
        List<Evaluation> evaluations = null;
        // Evaluation response = api.postEvaluation(userEvaluatedId, evaluations);

        // TODO: test validations
    }
    /**
     * Atualiza uma avaliação já registrada
     *
     * Um usuário que já registrou a sua avaliação pode atualizar a mesma caso ache necessário uma nova recomendação para o usuário avaliado
     */
    @Test
    public void putEvaluationTest() {
        String userEvaluatedId = null;
        List<Evaluation> evaluations = null;
        // Evaluation response = api.putEvaluation(userEvaluatedId, evaluations);

        // TODO: test validations
    }
}
