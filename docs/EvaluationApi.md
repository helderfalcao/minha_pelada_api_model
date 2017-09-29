# EvaluationApi

All URIs are relative to *http://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvaluation**](EvaluationApi.md#getEvaluation) | **GET** evaluation/{userEvaluatedId} | Retorna avaliações geradas por usuário registrados no sistema
[**getUsersEvaluationResumed**](EvaluationApi.md#getUsersEvaluationResumed) | **POST** evaluationResumed | Retorna avaliações resumo dos jogadores informados
[**postEvaluation**](EvaluationApi.md#postEvaluation) | **POST** evaluation/{userEvaluatedId} | Permite salvar uma nova avaliação
[**putEvaluation**](EvaluationApi.md#putEvaluation) | **PUT** evaluation/{userEvaluatedId} | Atualiza uma avaliação já registrada


<a name="getEvaluation"></a>
# **getEvaluation**
> List&lt;Evaluation&gt; getEvaluation(userEvaluatedId)

Retorna avaliações geradas por usuário registrados no sistema

Retorna as avaliações dos usuários que o usuário que consulta tem acesso

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EvaluationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EvaluationApi apiInstance = new EvaluationApi();
String userEvaluatedId = "userEvaluatedId_example"; // String | ID do usuário sendo avaliado
try {
    List<Evaluation> result = apiInstance.getEvaluation(userEvaluatedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvaluationApi#getEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEvaluatedId** | **String**| ID do usuário sendo avaliado |

### Return type

[**List&lt;Evaluation&gt;**](Evaluation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersEvaluationResumed"></a>
# **getUsersEvaluationResumed**
> List&lt;EvaluationResume&gt; getUsersEvaluationResumed(usersEvaluatedId)

Retorna avaliações resumo dos jogadores informados

Todos os jogadores tem determinadas características que são avaliadas por cada um dos seus colegas de partida, estas avaliações podem ser consultadas de forma resumida neste item

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EvaluationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EvaluationApi apiInstance = new EvaluationApi();
List<String> usersEvaluatedId = Arrays.asList(new List<String>()); // List<String> | IDs dos usuários a ser consultado o resumo
try {
    List<EvaluationResume> result = apiInstance.getUsersEvaluationResumed(usersEvaluatedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvaluationApi#getUsersEvaluationResumed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersEvaluatedId** | **List&lt;String&gt;**| IDs dos usuários a ser consultado o resumo |

### Return type

[**List&lt;EvaluationResume&gt;**](EvaluationResume.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postEvaluation"></a>
# **postEvaluation**
> Evaluation postEvaluation(userEvaluatedId, evaluations)

Permite salvar uma nova avaliação

Permite um usuário salvar uma nova avaliação de um usuário registrado em um de seus grupos

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EvaluationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EvaluationApi apiInstance = new EvaluationApi();
String userEvaluatedId = "userEvaluatedId_example"; // String | ID do usuário sendo avaliado
List<Evaluation> evaluations = Arrays.asList(new Evaluation()); // List<Evaluation> | 
try {
    Evaluation result = apiInstance.postEvaluation(userEvaluatedId, evaluations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvaluationApi#postEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEvaluatedId** | **String**| ID do usuário sendo avaliado |
 **evaluations** | [**List&lt;Evaluation&gt;**](Evaluation.md)|  |

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putEvaluation"></a>
# **putEvaluation**
> Evaluation putEvaluation(userEvaluatedId, evaluations)

Atualiza uma avaliação já registrada

Um usuário que já registrou a sua avaliação pode atualizar a mesma caso ache necessário uma nova recomendação para o usuário avaliado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EvaluationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EvaluationApi apiInstance = new EvaluationApi();
String userEvaluatedId = "userEvaluatedId_example"; // String | ID do usuário sendo avaliado
List<Evaluation> evaluations = Arrays.asList(new Evaluation()); // List<Evaluation> | 
try {
    Evaluation result = apiInstance.putEvaluation(userEvaluatedId, evaluations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvaluationApi#putEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEvaluatedId** | **String**| ID do usuário sendo avaliado |
 **evaluations** | [**List&lt;Evaluation&gt;**](Evaluation.md)|  |

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

