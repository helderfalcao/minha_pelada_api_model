# AuthApi

All URIs are relative to *http://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginFacebook**](AuthApi.md#loginFacebook) | **GET** user/facebook | Logs user into the system
[**loginGoogle**](AuthApi.md#loginGoogle) | **GET** user/google | Logs user into the system
[**loginUser**](AuthApi.md#loginUser) | **GET** user/login | Logs user into the system
[**logoutUser**](AuthApi.md#logoutUser) | **GET** user/logout | Logs out current logged in user session


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
> String loginGoogle()

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    String result = apiInstance.loginGoogle();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginGoogle");
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

<a name="loginUser"></a>
# **loginUser**
> String loginUser(username, password)

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String username = "username_example"; // String | The user name for login
String password = "password_example"; // String | The password for login in clear text
try {
    String result = apiInstance.loginUser(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The user name for login |
 **password** | **String**| The password for login in clear text |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="logoutUser"></a>
# **logoutUser**
> Void logoutUser()

Logs out current logged in user session

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

