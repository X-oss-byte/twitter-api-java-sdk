

# DisallowedResourceProblem

A problem that indicates that the resource requested violates the precepts of this API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceId** | **String** |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**section** | [**SectionEnum**](#SectionEnum) |  | 



## Enum: ResourceTypeEnum

Name | Value
---- | -----
TWEET | &quot;tweet&quot;
USER | &quot;user&quot;
MEDIA | &quot;media&quot;
LIST | &quot;list&quot;
SPACE | &quot;space&quot;



## Enum: SectionEnum

Name | Value
---- | -----
DATA | &quot;data&quot;
INCLUDES | &quot;includes&quot;



