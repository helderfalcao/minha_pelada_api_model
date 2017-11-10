# PresenceApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPresence**](PresenceApi.md#getPresence) | **GET** presence/{idUser}/{isPresent} | Serviço disponibilizado para que determinado usuário confirme ou não presença


<a name="getPresence"></a>
# **getPresence**
> Void getPresence(idUser, isPresent)

Serviço disponibilizado para que determinado usuário confirme ou não presença

Serviço que recebe o identificador do jogador e o status da presença do mesmo na próxima partida.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PresenceApi apiInstance = new PresenceApi();
String idUser = "idUser_example"; // String | Ids do usuário que irá confirmar presença
Boolean isPresent = true; // Boolean | Valor que será utilizado para identificar se o usuário estará presente ou não
try {
    Void result = apiInstance.getPresence(idUser, isPresent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **String**| Ids do usuário que irá confirmar presença |
 **isPresent** | **Boolean**| Valor que será utilizado para identificar se o usuário estará presente ou não |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

