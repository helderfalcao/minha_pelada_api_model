# MatchApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMatch**](MatchApi.md#getMatch) | **GET** match | Retorna as partidas dos grupos
[**getMatchSkeleton**](MatchApi.md#getMatchSkeleton) | **GET** matchSkeleton | Retorna os skeletons de partida do usuário
[**postMatch**](MatchApi.md#postMatch) | **POST** match | Salva uma nova parida para o grupo
[**postMatchSkeleton**](MatchApi.md#postMatchSkeleton) | **POST** matchSkeleton | Salva uma nova estrutura de partidas
[**putMatchSkeleton**](MatchApi.md#putMatchSkeleton) | **PUT** matchSkeleton | Atualizar uma estrutura de partidas


<a name="getMatch"></a>
# **getMatch**
> Match getMatch()

Retorna as partidas dos grupos

Retorna as partidas de um determinado grupo/grupos informados que o usuaário tenha acesso

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    Match result = apiInstance.getMatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Match**](Match.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchSkeleton"></a>
# **getMatchSkeleton**
> MatchSkeleton getMatchSkeleton()

Retorna os skeletons de partida do usuário

Retorna as estruturas de partidas que o usuário possui registrado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    MatchSkeleton result = apiInstance.getMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchSkeleton");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MatchSkeleton**](MatchSkeleton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMatch"></a>
# **postMatch**
> Match postMatch()

Salva uma nova parida para o grupo

Permite salvar uma nova partida para um determinado grupo

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    Match result = apiInstance.postMatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#postMatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Match**](Match.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMatchSkeleton"></a>
# **postMatchSkeleton**
> MatchSkeleton postMatchSkeleton()

Salva uma nova estrutura de partidas

Permite salvar uma nova estrutua de partidas

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    MatchSkeleton result = apiInstance.postMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#postMatchSkeleton");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MatchSkeleton**](MatchSkeleton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putMatchSkeleton"></a>
# **putMatchSkeleton**
> MatchSkeleton putMatchSkeleton()

Atualizar uma estrutura de partidas

Um usuário que já criou um skeleton de partidas poderá atualizar o mesmo independentemente de existirem partidas criadas com essa estrutura ou não

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    MatchSkeleton result = apiInstance.putMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#putMatchSkeleton");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MatchSkeleton**](MatchSkeleton.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

