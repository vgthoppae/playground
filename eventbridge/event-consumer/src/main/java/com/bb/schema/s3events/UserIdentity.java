package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UserIdentity implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sessionContext")
  private SessionContext sessionContext = null;

  @JsonProperty("accessKeyId")
  private String accessKeyId = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("arn")
  private String arn = null;

  @JsonProperty("principalId")
  private String principalId = null;

  @JsonProperty("type")
  private String type = null;

  public UserIdentity sessionContext(SessionContext sessionContext) {
    this.sessionContext = sessionContext;
    return this;
  }
  

  public SessionContext getSessionContext() {
    return sessionContext;
  }

  public void setSessionContext(SessionContext sessionContext) {
    this.sessionContext = sessionContext;
  }

  public UserIdentity accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }
  

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public UserIdentity accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
  

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserIdentity arn(String arn) {
    this.arn = arn;
    return this;
  }
  

  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public UserIdentity principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }
  

  public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }

  public UserIdentity type(String type) {
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
    UserIdentity userIdentity = (UserIdentity) o;
    return Objects.equals(this.sessionContext, userIdentity.sessionContext) &&
        Objects.equals(this.accessKeyId, userIdentity.accessKeyId) &&
        Objects.equals(this.accountId, userIdentity.accountId) &&
        Objects.equals(this.arn, userIdentity.arn) &&
        Objects.equals(this.principalId, userIdentity.principalId) &&
        Objects.equals(this.type, userIdentity.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(sessionContext, accessKeyId, accountId, arn, principalId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentity {\n");
    
    sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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
