package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AWSAPICallViaCloudTrailItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ARN")
  private String ARN = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("type")
  private String type = null;

  public AWSAPICallViaCloudTrailItem ARN(String ARN) {
    this.ARN = ARN;
    return this;
  }
  

  public String getARN() {
    return ARN;
  }

  public void setARN(String ARN) {
    this.ARN = ARN;
  }

  public AWSAPICallViaCloudTrailItem accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
  

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSAPICallViaCloudTrailItem type(String type) {
    this.type = type;
    return this;
  }
  

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAPICallViaCloudTrailItem awSAPICallViaCloudTrailItem = (AWSAPICallViaCloudTrailItem) o;
    return Objects.equals(this.ARN, awSAPICallViaCloudTrailItem.ARN) &&
        Objects.equals(this.accountId, awSAPICallViaCloudTrailItem.accountId) &&
        Objects.equals(this.type, awSAPICallViaCloudTrailItem.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(ARN, accountId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAPICallViaCloudTrailItem {\n");
    
    sb.append("    ARN: ").append(toIndentedString(ARN)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
