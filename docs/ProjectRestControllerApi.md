# ProjectRestControllerApi

All URIs are relative to *https://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProjectUsingPOST**](ProjectRestControllerApi.md#addProjectUsingPOST) | **POST** /project | Creates the new project in Promitea
[**listUsingGET**](ProjectRestControllerApi.md#listUsingGET) | **GET** /projects | Get project list from Promitea
[**showProjectUsingGET**](ProjectRestControllerApi.md#showProjectUsingGET) | **GET** /project/{id} | Get project detail from Promitea


<a name="addProjectUsingPOST"></a>
# **addProjectUsingPOST**
> Project addProjectUsingPOST(projectModel)

Creates the new project in Promitea

Returns project detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectRestControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization-Key
ApiKeyAuth Authorization-Key = (ApiKeyAuth) defaultClient.getAuthentication("Authorization-Key");
Authorization-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization-Key.setApiKeyPrefix("Token");

ProjectRestControllerApi apiInstance = new ProjectRestControllerApi();
Project projectModel = new Project(); // Project | Project object that needs to be added
try {
    Project result = apiInstance.addProjectUsingPOST(projectModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectRestControllerApi#addProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectModel** | [**Project**](Project.md)| Project object that needs to be added |

### Return type

[**Project**](Project.md)

### Authorization

[Authorization-Key](../README.md#Authorization-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> List&lt;ProjectBasicInfo&gt; listUsingGET()

Get project list from Promitea

Returns project header list from Promitea

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectRestControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization-Key
ApiKeyAuth Authorization-Key = (ApiKeyAuth) defaultClient.getAuthentication("Authorization-Key");
Authorization-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization-Key.setApiKeyPrefix("Token");

ProjectRestControllerApi apiInstance = new ProjectRestControllerApi();
try {
    List<ProjectBasicInfo> result = apiInstance.listUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectRestControllerApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectBasicInfo&gt;**](ProjectBasicInfo.md)

### Authorization

[Authorization-Key](../README.md#Authorization-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="showProjectUsingGET"></a>
# **showProjectUsingGET**
> Project showProjectUsingGET(id)

Get project detail from Promitea

Returns project detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectRestControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization-Key
ApiKeyAuth Authorization-Key = (ApiKeyAuth) defaultClient.getAuthentication("Authorization-Key");
Authorization-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization-Key.setApiKeyPrefix("Token");

ProjectRestControllerApi apiInstance = new ProjectRestControllerApi();
Long id = 789L; // Long | id
try {
    Project result = apiInstance.showProjectUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectRestControllerApi#showProjectUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Project**](Project.md)

### Authorization

[Authorization-Key](../README.md#Authorization-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

