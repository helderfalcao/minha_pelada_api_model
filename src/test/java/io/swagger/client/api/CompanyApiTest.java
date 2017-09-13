package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Company;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyApi
 */
public class CompanyApiTest {

    private CompanyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CompanyApi.class);
    }

    /**
     * Retorna grupos gerenciadores de quadras
     *
     * Retorna grupos organizadores de quadras de acordo com a query informada
     */
    @Test
    public void getCompanyTest() {
        // Company response = api.getCompany();

        // TODO: test validations
    }
    /**
     * Permite salvar um novo grupo de quadras
     *
     * Salva um novo grupo de organização de quadras, estes grupos demitem o gerenciamente centralizado de administradores
     */
    @Test
    public void postCompanyTest() {
        // Company response = api.postCompany();

        // TODO: test validations
    }
    /**
     * Atualiza o grupo organizador
     *
     * Permite a atualização do grupo organizador pelo usuário criador
     */
    @Test
    public void putCompanyTest() {
        // Company response = api.putCompany();

        // TODO: test validations
    }
}
