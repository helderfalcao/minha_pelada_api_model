# SortApi

All URIs are relative to *https://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimesSort**](SortApi.md#getTimesSort) | **POST** sortTimes/{timeQuantity}/{timestampSort} | Retorna times nivelados de acordo com o valor retornado


<a name="getTimesSort"></a>
# **getTimesSort**
> Time getTimesSort(timeQuantity, timestampSort, usersToSort)

Retorna times nivelados de acordo com o valor retornado

Este serviço trabalha recebendo informações de avaliação dos jogadores e a quantidade de jogadores em cada time

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SortApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SortApi apiInstance = new SortApi();
BigDecimal timeQuantity = new BigDecimal(); // BigDecimal | A quantidade de jogadores em cada time
BigDecimal timestampSort = new BigDecimal(); // BigDecimal | O valor do horário a ser utilizado para o sorteio
List<User> usersToSort = Arrays.asList(new User()); // List<User> | Os jogadores que serão sorteados
try {
    Time result = apiInstance.getTimesSort(timeQuantity, timestampSort, usersToSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SortApi#getTimesSort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeQuantity** | **BigDecimal**| A quantidade de jogadores em cada time |
 **timestampSort** | **BigDecimal**| O valor do horário a ser utilizado para o sorteio |
 **usersToSort** | [**List&lt;User&gt;**](User.md)| Os jogadores que serão sorteados |

### Return type

[**Time**](Time.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

