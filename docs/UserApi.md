# UserApi

All URIs are relative to *http://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UserApi.md#getUser) | **GET** user | Retorna usuários de acordo com os dados informados na query
[**getUserByGroup**](UserApi.md#getUserByGroup) | **GET** user/{groupId} | Retorna usuários de um determinado grupo
[**getUserByIds**](UserApi.md#getUserByIds) | **POST** userList | Salva usuário de acordo com os dados informados na autenticação
[**postUser**](UserApi.md#postUser) | **POST** user | Retorna os usuário de acordo com a lista de ids informada na requisição
[**putUser**](UserApi.md#putUser) | **PUT** user | Atualize um usuário registrado no sistema(Somente permitido para o próprio usuário)


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
> User getUserByIds(userIds)

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
List<User> userIds = Arrays.asList(new User()); // List<User> | Ids dos usuários a serem consultados
try {
    User result = apiInstance.getUserByIds(userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**List&lt;User&gt;**](User.md)| Ids dos usuários a serem consultados |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUser"></a>
# **postUser**
> List&lt;User&gt; postUser()

Retorna os usuário de acordo com a lista de ids informada na requisição

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
    List<User> result = apiInstance.postUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#postUser");
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

<a name="putUser"></a>
# **putUser**
> User putUser()

Atualize um usuário registrado no sistema(Somente permitido para o próprio usuário)

Permite o usuário atualizar seus dados pessoais

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
    User result = apiInstance.putUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#putUser");
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

