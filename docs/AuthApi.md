# AuthApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginFacebook**](AuthApi.md#loginFacebook) | **GET** auth/facebook | Logs user into the system
[**loginGoogle**](AuthApi.md#loginGoogle) | **GET** auth/google | Logs user into the system
[**loginGoogleToken**](AuthApi.md#loginGoogleToken) | **POST** auth/google/token | Logs user into the system
[**logoutUser**](AuthApi.md#logoutUser) | **GET** auth/logout | Logs user into the system


<a name="loginFacebook"></a>
# **loginFacebook**
> Void loginFacebook()

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    Void result = apiInstance.loginFacebook();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginFacebook");
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

<a name="loginGoogle"></a>
# **loginGoogle**
> Void loginGoogle(group)

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String group = "group_example"; // String | O grupo que este usuário irá se inscrever/ver
try {
    Void result = apiInstance.loginGoogle(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginGoogle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| O grupo que este usuário irá se inscrever/ver | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="loginGoogleToken"></a>
# **loginGoogleToken**
> Void loginGoogleToken(idToken, group)

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String idToken = "idToken_example"; // String | O token de acesso necessário para autenticação
String group = "group_example"; // String | O grupo que este usuário irá se inscrever/ver
try {
    Void result = apiInstance.loginGoogleToken(idToken, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginGoogleToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idToken** | **String**| O token de acesso necessário para autenticação |
 **group** | **String**| O grupo que este usuário irá se inscrever/ver | [optional]

### Return type

[**Void**](.md)

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

