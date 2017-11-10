package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PresenceApi
 */
public class PresenceApiTest {

    private PresenceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PresenceApi.class);
    }

    /**
     * Serviço disponibilizado para que determinado usuário confirme ou não presença
     *
     * Serviço que recebe o identificador do jogador e o status da presença do mesmo na próxima partida.
     */
    @Test
    public void getPresenceTest() {
        String idUser = null;
        Boolean isPresent = null;
        // Void response = api.getPresence(idUser, isPresent);

        // TODO: test validations
    }
}
