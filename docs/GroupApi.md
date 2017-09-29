# GroupApi

All URIs are relative to *http://minhapeladaapi.herokuapp.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroup**](GroupApi.md#addGroup) | **POST** group | Add a new group
[**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** group/{groupId} | Deletes a group
[**findGroup**](GroupApi.md#findGroup) | **GET** group | Find groups by public informations
[**findUserGroups**](GroupApi.md#findUserGroups) | **GET** group/findUserGroups | Find Groups of the current user
[**getGroupById**](GroupApi.md#getGroupById) | **GET** group/{groupId} | Find group by ID
[**updateGroup**](GroupApi.md#updateGroup) | **PUT** group | Update an existing group


<a name="addGroup"></a>
# **addGroup**
> Void addGroup(group)

Add a new group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Group group = new Group(); // Group | Group to be registered to the platform
try {
    Void result = apiInstance.addGroup(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**Group**](Group.md)| Group to be registered to the platform |

### Return type

[**Void**](.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteGroup"></a>
# **deleteGroup**
> Void deleteGroup(groupId)

Deletes a group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | Group id to delete
try {
    Void result = apiInstance.deleteGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group id to delete |

### Return type

[**Void**](.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findGroup"></a>
# **findGroup**
> List&lt;Group&gt; findGroup()

Find groups by public informations

Multiple atributes of the group can be used on this operation. Can be used\\ \\ status, name, available space.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
try {
    List<Group> result = apiInstance.findGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#findGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findUserGroups"></a>
# **findUserGroups**
> List&lt;Group&gt; findUserGroups(userGroup)

Find Groups of the current user

Retunr the groups of the authenticated user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
List<String> userGroup = Arrays.asList("userGroup_example"); // List<String> | User Group values that need to be considered for filter
try {
    List<Group> result = apiInstance.findUserGroups(userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#findUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroup** | [**List&lt;String&gt;**](String.md)| User Group values that need to be considered for filter | [enum: admin, participant]

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getGroupById"></a>
# **getGroupById**
> Group getGroupById(groupId)

Find group by ID

Returns a single group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
String groupId = "groupId_example"; // String | ID of group to return
try {
    Group result = apiInstance.getGroupById(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of group to return |

### Return type

[**Group**](Group.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateGroup"></a>
# **updateGroup**
> Void updateGroup(group)

Update an existing group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: group_auth
OAuth group_auth = (OAuth) defaultClient.getAuthentication("group_auth");
group_auth.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Group group = new Group(); // Group | Group object to be updated to the platform
try {
    Void result = apiInstance.updateGroup(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**Group**](Group.md)| Group object to be updated to the platform |

### Return type

[**Void**](.md)

### Authorization

[group_auth](../README.md#group_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

