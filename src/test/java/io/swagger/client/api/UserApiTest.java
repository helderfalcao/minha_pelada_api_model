package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserApi.class);
    }

    /**
     * Retorna usuários de acordo com os dados informados na query
     *
     * Retorna usuários registrados no sistema de acordo com a pesquisa
     */
    @Test
    public void getUserTest() {
        // User response = api.getUser();

        // TODO: test validations
    }
    /**
     * Retorna usuários de um determinado grupo
     *
     * Retorna usuários registrados no sistema que pertencem ao id do grupo informado
     */
    @Test
    public void getUserByGroupTest() {
        String groupId = null;
        // User response = api.getUserByGroup(groupId);

        // TODO: test validations
    }
    /**
     * Salva usuário de acordo com os dados informados na autenticação
     *
     * Permite salvar um novo usuário autenticado
     */
    @Test
    public void postUserTest() {
        // User response = api.postUser();

        // TODO: test validations
    }
    /**
     * Atualize um usuário registrado no sistema(Somente permitido para o próprio usuário)
     *
     * Permite o usuário atualizar seus dados pessoais
     */
    @Test
    public void putUserTest() {
        // User response = api.putUser();

        // TODO: test validations
    }
}
