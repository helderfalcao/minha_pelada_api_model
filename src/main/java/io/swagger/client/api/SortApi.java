package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.math.BigDecimal;
import io.swagger.client.model.Time;
import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SortApi {
  /**
   * Retorna times nivelados de acordo com o valor retornado
   * Este serviço trabalha recebendo informações de avaliação dos jogadores e a quantidade de jogadores em cada time
   * @param timeQuantity A quantidade de jogadores em cada time (required)
   * @param timestampSort O valor do horário a ser utilizado para o sorteio (required)
   * @param usersToSort Os jogadores que serão sorteados (required)
   * @return Call&lt;Time&gt;
   */
  @POST("sortTimes/{timeQuantity}/{timestampSort}")
  Call<Time> getTimesSort(
    @retrofit2.http.Path("timeQuantity") BigDecimal timeQuantity, @retrofit2.http.Path("timestampSort") BigDecimal timestampSort, @retrofit2.http.Body List<User> usersToSort
  );

}
