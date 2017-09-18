# BlockApi

All URIs are relative to *http://localhost:8888/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlock**](BlockApi.md#getBlock) | **GET** block | Retorna as quadras de acordo com a query informada
[**postBlock**](BlockApi.md#postBlock) | **POST** block | Permite salvar uma nova quadra
[**putMatch**](BlockApi.md#putMatch) | **PUT** block | Atualiza a quadra


<a name="getBlock"></a>
# **getBlock**
> Block getBlock()

Retorna as quadras de acordo com a query informada

As quadras registradas no sistema por donos permitidos pelo sistema são consultadas e retornadas pela consulta dos usuários

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
try {
    Block result = apiInstance.getBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Block**](Block.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postBlock"></a>
# **postBlock**
> Block postBlock()

Permite salvar uma nova quadra

Salva a quadra registrada pelo usuário que possui permissão para registro desta entidade no sistema

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
try {
    Block result = apiInstance.postBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#postBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Block**](Block.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putMatch"></a>
# **putMatch**
> User putMatch()

Atualiza a quadra

Permite a atualização da quadra pelo usuário que criou a mesma

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
try {
    User result = apiInstance.putMatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#putMatch");
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

