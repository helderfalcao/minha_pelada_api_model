# AuthApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginFacebook**](AuthApi.md#loginFacebook) | **GET** auth/facebook | Logs user into the system
[**loginGoogle**](AuthApi.md#loginGoogle) | **GET** auth/google | Logs user into the system
[**logoutUser**](AuthApi.md#logoutUser) | **GET** auth/logout | Logs user into the system


<a name="loginFacebook"></a>
# **loginFacebook**
> String loginFacebook()

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    String result = apiInstance.loginFacebook();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginFacebook");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="loginGoogle"></a>
# **loginGoogle**
> User loginGoogle()

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    User result = apiInstance.loginGoogle();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginGoogle");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="logoutUser"></a>
# **logoutUser**
> Void logoutUser()

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    Void result = apiInstance.logoutUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#logoutUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

