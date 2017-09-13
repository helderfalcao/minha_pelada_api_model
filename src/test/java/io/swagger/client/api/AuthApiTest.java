package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
public class AuthApiTest {

    private AuthApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthApi.class);
    }

    /**
     * Logs user into the system
     *
     * 
     */
    @Test
    public void loginFacebookTest() {
        // String response = api.loginFacebook();

        // TODO: test validations
    }
    /**
     * Logs user into the system
     *
     * 
     */
    @Test
    public void loginGoogleTest() {
        // String response = api.loginGoogle();

        // TODO: test validations
    }
    /**
     * Logs user into the system
     *
     * 
     */
    @Test
    public void loginUserTest() {
        String username = null;
        String password = null;
        // String response = api.loginUser(username, password);

        // TODO: test validations
    }
    /**
     * Logs out current logged in user session
     *
     * 
     */
    @Test
    public void logoutUserTest() {
        // Void response = api.logoutUser();

        // TODO: test validations
    }
}
