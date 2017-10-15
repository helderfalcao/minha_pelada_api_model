package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.User;

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
  @GET("auth/facebook")
  Call<String> loginFacebook();
    

  /**
   * Logs user into the system
   * 
   * @return Call&lt;User&gt;
   */
  @GET("auth/google")
  Call<User> loginGoogle();
    

  /**
   * Logs user into the system
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("auth/logout")
  Call<Void> logoutUser();
    

}
