# MatchApi

All URIs are relative to *http://localhost:8888/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMatch**](MatchApi.md#getMatch) | **GET** match | Retorna as partidas dos grupos
[**postMatch**](MatchApi.md#postMatch) | **POST** match | Salva uma nova parida para o grupo


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

