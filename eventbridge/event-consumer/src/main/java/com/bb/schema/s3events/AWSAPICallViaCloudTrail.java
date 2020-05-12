package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;

public class AWSAPICallViaCloudTrail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("additionalEventData")
  private AdditionalEventData additionalEventData = null;

  @JsonProperty("requestParameters")
  private RequestParameters requestParameters = null;

  @JsonProperty("userIdentity")
  private UserIdentity userIdentity = null;

  @JsonProperty("awsRegion")
  private String awsRegion = null;

  @JsonProperty("eventID")
  private String eventID = null;

  @JsonProperty("eventName")
  private String eventName = null;

  @JsonProperty("eventSource")
  private String eventSource = null;

  @JsonProperty("eventTime")
  private Date eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("eventVersion")
  private String eventVersion = null;

  @JsonProperty("readOnly")
  private Boolean readOnly = null;

  @JsonProperty("recipientAccountId")
  private String recipientAccountId = null;

  @JsonProperty("requestID")
  private String requestID = null;

  @JsonProperty("resources")
  private List<AWSAPICallViaCloudTrailItem> resources = new ArrayList<AWSAPICallViaCloudTrailItem>();

  @JsonProperty("responseElements")
  private Object responseElements = null;

  @JsonProperty("sourceIPAddress")
  private String sourceIPAddress = null;

  @JsonProperty("userAgent")
  private String userAgent = null;

  @JsonProperty("vpcEndpointId")
  private String vpcEndpointId = null;

  public AWSAPICallViaCloudTrail additionalEventData(AdditionalEventData additionalEventData) {
    this.additionalEventData = additionalEventData;
    return this;
  }
  

  public AdditionalEventData getAdditionalEventData() {
    return additionalEventData;
  }

  public void setAdditionalEventData(AdditionalEventData additionalEventData) {
    this.additionalEventData = additionalEventData;
  }

  public AWSAPICallViaCloudTrail requestParameters(RequestParameters requestParameters) {
    this.requestParameters = requestParameters;
    return this;
  }
  

  public RequestParameters getRequestParameters() {
    return requestParameters;
  }

  public void setRequestParameters(RequestParameters requestParameters) {
    this.requestParameters = requestParameters;
  }

  public AWSAPICallViaCloudTrail userIdentity(UserIdentity userIdentity) {
    this.userIdentity = userIdentity;
    return this;
  }
  

  public UserIdentity getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(UserIdentity userIdentity) {
    this.userIdentity = userIdentity;
  }

  public AWSAPICallViaCloudTrail awsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }
  

  public String getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }

  public AWSAPICallViaCloudTrail eventID(String eventID) {
    this.eventID = eventID;
    return this;
  }
  

  public String getEventID() {
    return eventID;
  }

  public void setEventID(String eventID) {
    this.eventID = eventID;
  }

  public AWSAPICallViaCloudTrail eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public AWSAPICallViaCloudTrail eventSource(String eventSource) {
    this.eventSource = eventSource;
    return this;
  }
  

  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  public AWSAPICallViaCloudTrail eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  

  public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public AWSAPICallViaCloudTrail eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }
  

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AWSAPICallViaCloudTrail eventVersion(String eventVersion) {
    this.eventVersion = eventVersion;
    return this;
  }
  

  public String getEventVersion() {
    return eventVersion;
  }

  public void setEventVersion(String eventVersion) {
    this.eventVersion = eventVersion;
  }

  public AWSAPICallViaCloudTrail readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
  

  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public AWSAPICallViaCloudTrail recipientAccountId(String recipientAccountId) {
    this.recipientAccountId = recipientAccountId;
    return this;
  }
  

  public String getRecipientAccountId() {
    return recipientAccountId;
  }

  public void setRecipientAccountId(String recipientAccountId) {
    this.recipientAccountId = recipientAccountId;
  }

  public AWSAPICallViaCloudTrail requestID(String requestID) {
    this.requestID = requestID;
    return this;
  }
  

  public String getRequestID() {
    return requestID;
  }

  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  public AWSAPICallViaCloudTrail resources(List<AWSAPICallViaCloudTrailItem> resources) {
    this.resources = resources;
    return this;
  }
  public AWSAPICallViaCloudTrail addResourcesItem(AWSAPICallViaCloudTrailItem resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

  public List<AWSAPICallViaCloudTrailItem> getResources() {
    return resources;
  }

  public void setResources(List<AWSAPICallViaCloudTrailItem> resources) {
    this.resources = resources;
  }

  public AWSAPICallViaCloudTrail responseElements(Object responseElements) {
    this.responseElements = responseElements;
    return this;
  }
  

  public Object getResponseElements() {
    return responseElements;
  }

  public void setResponseElements(Object responseElements) {
    this.responseElements = responseElements;
  }

  public AWSAPICallViaCloudTrail sourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
    return this;
  }
  

  public String getSourceIPAddress() {
    return sourceIPAddress;
  }

  public void setSourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
  }

  public AWSAPICallViaCloudTrail userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }
  

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public AWSAPICallViaCloudTrail vpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }
  

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  public void setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAPICallViaCloudTrail awSAPICallViaCloudTrail = (AWSAPICallViaCloudTrail) o;
    return Objects.equals(this.additionalEventData, awSAPICallViaCloudTrail.additionalEventData) &&
        Objects.equals(this.requestParameters, awSAPICallViaCloudTrail.requestParameters) &&
        Objects.equals(this.userIdentity, awSAPICallViaCloudTrail.userIdentity) &&
        Objects.equals(this.awsRegion, awSAPICallViaCloudTrail.awsRegion) &&
        Objects.equals(this.eventID, awSAPICallViaCloudTrail.eventID) &&
        Objects.equals(this.eventName, awSAPICallViaCloudTrail.eventName) &&
        Objects.equals(this.eventSource, awSAPICallViaCloudTrail.eventSource) &&
        Objects.equals(this.eventTime, awSAPICallViaCloudTrail.eventTime) &&
        Objects.equals(this.eventType, awSAPICallViaCloudTrail.eventType) &&
        Objects.equals(this.eventVersion, awSAPICallViaCloudTrail.eventVersion) &&
        Objects.equals(this.readOnly, awSAPICallViaCloudTrail.readOnly) &&
        Objects.equals(this.recipientAccountId, awSAPICallViaCloudTrail.recipientAccountId) &&
        Objects.equals(this.requestID, awSAPICallViaCloudTrail.requestID) &&
        Objects.equals(this.resources, awSAPICallViaCloudTrail.resources) &&
        Objects.equals(this.responseElements, awSAPICallViaCloudTrail.responseElements) &&
        Objects.equals(this.sourceIPAddress, awSAPICallViaCloudTrail.sourceIPAddress) &&
        Objects.equals(this.userAgent, awSAPICallViaCloudTrail.userAgent) &&
        Objects.equals(this.vpcEndpointId, awSAPICallViaCloudTrail.vpcEndpointId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(additionalEventData, requestParameters, userIdentity, awsRegion, eventID, eventName, eventSource, eventTime, eventType, eventVersion, readOnly, recipientAccountId, requestID, resources, responseElements, sourceIPAddress, userAgent, vpcEndpointId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAPICallViaCloudTrail {\n");
    
    sb.append("    additionalEventData: ").append(toIndentedString(additionalEventData)).append("\n");
    sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
    sb.append("    userIdentity: ").append(toIndentedString(userIdentity)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventVersion: ").append(toIndentedString(eventVersion)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recipientAccountId: ").append(toIndentedString(recipientAccountId)).append("\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    responseElements: ").append(toIndentedString(responseElements)).append("\n");
    sb.append("    sourceIPAddress: ").append(toIndentedString(sourceIPAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
