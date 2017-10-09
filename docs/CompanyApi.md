# CompanyApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompany**](CompanyApi.md#getCompany) | **GET** company | Retorna grupos gerenciadores de quadras
[**postCompany**](CompanyApi.md#postCompany) | **POST** company | Permite salvar um novo grupo de quadras
[**putCompany**](CompanyApi.md#putCompany) | **PUT** company | Atualiza o grupo organizador


<a name="getCompany"></a>
# **getCompany**
> Company getCompany()

Retorna grupos gerenciadores de quadras

Retorna grupos organizadores de quadras de acordo com a query informada

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CompanyApi apiInstance = new CompanyApi();
try {
    Company result = apiInstance.getCompany();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompany");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Company**](Company.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCompany"></a>
# **postCompany**
> Company postCompany()

Permite salvar um novo grupo de quadras

Salva um novo grupo de organização de quadras, estes grupos demitem o gerenciamente centralizado de administradores

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CompanyApi apiInstance = new CompanyApi();
try {
    Company result = apiInstance.postCompany();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#postCompany");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Company**](Company.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCompany"></a>
# **putCompany**
> Company putCompany()

Atualiza o grupo organizador

Permite a atualização do grupo organizador pelo usuário criador

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CompanyApi apiInstance = new CompanyApi();
try {
    Company result = apiInstance.putCompany();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#putCompany");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Company**](Company.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

