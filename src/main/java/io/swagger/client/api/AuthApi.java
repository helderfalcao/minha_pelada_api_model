package io.swagger.client.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;


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
   * @param accessToken O token de acesso necessário para autenticação (required)
   * @param group O grupo que este usuário irá se inscrever/ver (optional)
   * @param refreshToken O token de acesso necessário para autenticação (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("auth/google/token")
  Call<Void> loginGoogleToken(
    @retrofit2.http.Body String accessToken, @retrofit2.http.Query("group") String group, @retrofit2.http.Query("refresh_token") String refreshToken
  );

  /**
   * Logs user into the system
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("auth/logout")
  Call<Void> logoutUser();
    

}
