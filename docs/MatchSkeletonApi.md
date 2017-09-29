# MatchSkeletonApi

All URIs are relative to *http://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMatchSkeleton**](MatchSkeletonApi.md#getMatchSkeleton) | **GET** matchSkeleton | Retorna os skeletons de partida do usuário
[**postMatchSkeleton**](MatchSkeletonApi.md#postMatchSkeleton) | **POST** matchSkeleton | Salva uma nova estrutura de partidas
[**putMatchSkeleton**](MatchSkeletonApi.md#putMatchSkeleton) | **PUT** matchSkeleton | Atualizar uma estrutura de partidas


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
//import io.swagger.client.api.MatchSkeletonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchSkeletonApi apiInstance = new MatchSkeletonApi();
try {
    MatchSkeleton result = apiInstance.getMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchSkeletonApi#getMatchSkeleton");
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
//import io.swagger.client.api.MatchSkeletonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchSkeletonApi apiInstance = new MatchSkeletonApi();
try {
    MatchSkeleton result = apiInstance.postMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchSkeletonApi#postMatchSkeleton");
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
//import io.swagger.client.api.MatchSkeletonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MatchSkeletonApi apiInstance = new MatchSkeletonApi();
try {
    MatchSkeleton result = apiInstance.putMatchSkeleton();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchSkeletonApi#putMatchSkeleton");
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

