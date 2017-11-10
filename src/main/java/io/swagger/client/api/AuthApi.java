package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthApi {
  /**
   * Logs user into the system
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("auth/facebook")
  Call<Void> loginFacebook();
    

  /**
   * Logs user into the system
   * 
   * @param group O grupo que este usuário irá se inscrever/ver (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("auth/google")
  Call<Void> loginGoogle(
    @retrofit2.http.Query("group") String group
  );

  /**
   * Logs user into the system
   * 
   * @param idToken O token de acesso necessário para autenticação (required)
   * @param group O grupo que este usuário irá se inscrever/ver (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("auth/google/token")
  Call<Void> loginGoogleToken(
    @retrofit2.http.Query("id_token") String idToken, @retrofit2.http.Query("group") String group
  );

  /**
   * Logs user into the system
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("auth/logout")
  Call<Void> logoutUser();
    

}
