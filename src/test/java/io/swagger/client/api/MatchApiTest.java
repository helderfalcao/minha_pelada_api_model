package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Match;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MatchApi
 */
public class MatchApiTest {

    private MatchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MatchApi.class);
    }

    /**
     * Retorna as partidas dos grupos
     *
     * Retorna as partidas de um determinado grupo/grupos informados que o usuaário tenha acesso
     */
    @Test
    public void getMatchTest() {
        // Match response = api.getMatch();

        // TODO: test validations
    }
    /**
     * Salva uma nova parida para o grupo
     *
     * Permite salvar uma nova partida para um determinado grupo
     */
    @Test
    public void postMatchTest() {
        // Match response = api.postMatch();

        // TODO: test validations
    }
}
