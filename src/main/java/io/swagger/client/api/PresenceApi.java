package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PresenceApi {
  /**
   * Serviço disponibilizado para que determinado usuário confirme ou não presença
   * Serviço que recebe o identificador do jogador e o status da presença do mesmo na próxima partida.
   * @param idUser Ids do usuário que irá confirmar presença (required)
   * @param isPresent Valor que será utilizado para identificar se o usuário estará presente ou não (required)
   * @return Call&lt;Void&gt;
   */
  @GET("presence/{idUser}/{isPresent}")
  Call<Void> getPresence(
    @retrofit2.http.Path("idUser") String idUser, @retrofit2.http.Path("isPresent") Boolean isPresent
  );

}
