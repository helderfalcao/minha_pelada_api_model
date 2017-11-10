# UserApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UserApi.md#getUser) | **GET** user | Retorna usuários de acordo com os dados informados na query
[**getUserByGroup**](UserApi.md#getUserByGroup) | **GET** user/{groupId} | Retorna usuários de um determinado grupo
[**getUserByIds**](UserApi.md#getUserByIds) | **POST** userList | Salva usuário de acordo com os dados informados na autenticação
[**getUserProfile**](UserApi.md#getUserProfile) | **GET** userProfile | Retorna as informações do atual usuário


<a name="getUser"></a>
# **getUser**
> List&lt;User&gt; getUser()

Retorna usuários de acordo com os dados informados na query

Retorna usuários registrados no sistema de acordo com a pesquisa

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    List<User> result = apiInstance.getUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByGroup"></a>
# **getUserByGroup**
> List&lt;User&gt; getUserByGroup(groupId)

Retorna usuários de um determinado grupo

Retorna usuários registrados no sistema que pertencem ao id do grupo informado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String groupId = "groupId_example"; // String | ID do grupo que terão os usuário retornados
try {
    List<User> result = apiInstance.getUserByGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID do grupo que terão os usuário retornados |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByIds"></a>
# **getUserByIds**
> List&lt;User&gt; getUserByIds(userIds, isPresent)

Salva usuário de acordo com os dados informados na autenticação

Permite salvar um novo usuário autenticado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
List<String> userIds = Arrays.asList(new List<String>()); // List<String> | Ids dos usuários a serem consultados
Boolean isPresent = true; // Boolean | Informa se os jogadores estarão presentes na próxima partida
try {
    List<User> result = apiInstance.getUserByIds(userIds, isPresent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | **List&lt;String&gt;**| Ids dos usuários a serem consultados | [optional]
 **isPresent** | **Boolean**| Informa se os jogadores estarão presentes na próxima partida | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserProfile"></a>
# **getUserProfile**
> User getUserProfile()

Retorna as informações do atual usuário

Retorna os dados do atual usuário autenticado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    User result = apiInstance.getUserProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

