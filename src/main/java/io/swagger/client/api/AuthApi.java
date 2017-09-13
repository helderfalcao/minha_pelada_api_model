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
   * @return Call&lt;String&gt;
   */
  @GET("user/facebook")
  Call<String> loginFacebook();
    

  /**
   * Logs user into the system
   * 
   * @return Call&lt;String&gt;
   */
  @GET("user/google")
  Call<String> loginGoogle();
    

  /**
   * Logs user into the system
   * 
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return Call&lt;String&gt;
   */
  @GET("user/login")
  Call<String> loginUser(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
  );

  /**
   * Logs out current logged in user session
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("user/logout")
  Call<Void> logoutUser();
    

}
