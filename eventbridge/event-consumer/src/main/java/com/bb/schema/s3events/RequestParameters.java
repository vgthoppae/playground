package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RequestParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bucketName")
  private String bucketName = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("legal-hold")
  private String legalHold = null;

  public RequestParameters bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }
  

  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public RequestParameters key(String key) {
    this.key = key;
    return this;
  }
  

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RequestParameters legalHold(String legalHold) {
    this.legalHold = legalHold;
    return this;
  }
  

  public String getLegalHold() {
    return legalHold;
  }

  public void setLegalHold(String legalHold) {
    this.legalHold = legalHold;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestParameters requestParameters = (RequestParameters) o;
    return Objects.equals(this.bucketName, requestParameters.bucketName) &&
        Objects.equals(this.key, requestParameters.key) &&
        Objects.equals(this.legalHold, requestParameters.legalHold);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bucketName, key, legalHold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestParameters {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    legalHold: ").append(toIndentedString(legalHold)).append("\n");
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
