package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse2005;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SortApi
 */
public class SortApiTest {

    private SortApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SortApi.class);
    }

    /**
     * Retorna times nivelados de acordo com o valor retornado
     *
     * Este serviço trabalha recebendo informações de avaliação dos jogadores e a quantidade de jogadores em cada time
     */
    @Test
    public void getTimesSortTest() {
        BigDecimal timeQuantity = null;
        BigDecimal timestampSort = null;
        List<InlineResponse2005> usersToSort = null;
        // InlineResponse20011 response = api.getTimesSort(timeQuantity, timestampSort, usersToSort);

        // TODO: test validations
    }
}
