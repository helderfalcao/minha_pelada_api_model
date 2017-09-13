package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Block;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
public class BlockApiTest {

    private BlockApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BlockApi.class);
    }

    /**
     * Retorna as quadras de acordo com a query informada
     *
     * As quadras registradas no sistema por donos permitidos pelo sistema são consultadas e retornadas pela consulta dos usuários
     */
    @Test
    public void getBlockTest() {
        // Block response = api.getBlock();

        // TODO: test validations
    }
    /**
     * Permite salvar uma nova quadra
     *
     * Salva a quadra registrada pelo usuário que possui permissão para registro desta entidade no sistema
     */
    @Test
    public void postBlockTest() {
        // Block response = api.postBlock();

        // TODO: test validations
    }
    /**
     * Atualiza a quadra
     *
     * Permite a atualização da quadra pelo usuário que criou a mesma
     */
    @Test
    public void putMatchTest() {
        // User response = api.putMatch();

        // TODO: test validations
    }
}
