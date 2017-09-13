package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.MatchSkeleton;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MatchSkeletonApi
 */
public class MatchSkeletonApiTest {

    private MatchSkeletonApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MatchSkeletonApi.class);
    }

    /**
     * Retorna os skeletons de partida do usuário
     *
     * Retorna as estruturas de partidas que o usuário possui registrado
     */
    @Test
    public void getMatchSkeletonTest() {
        // MatchSkeleton response = api.getMatchSkeleton();

        // TODO: test validations
    }
    /**
     * Salva uma nova estrutura de partidas
     *
     * Permite salvar uma nova estrutua de partidas
     */
    @Test
    public void postMatchSkeletonTest() {
        // MatchSkeleton response = api.postMatchSkeleton();

        // TODO: test validations
    }
    /**
     * Atualizar uma estrutura de partidas
     *
     * Um usuário que já criou um skeleton de partidas poderá atualizar o mesmo independentemente de existirem partidas criadas com essa estrutura ou não
     */
    @Test
    public void putMatchSkeletonTest() {
        // MatchSkeleton response = api.putMatchSkeleton();

        // TODO: test validations
    }
}
