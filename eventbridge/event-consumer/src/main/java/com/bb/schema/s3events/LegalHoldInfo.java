package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class LegalHoldInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("isUnderLegalHold")
  private Boolean isUnderLegalHold = null;

  @JsonProperty("lastModifiedTime")
  private Long lastModifiedTime = null;

  public LegalHoldInfo isUnderLegalHold(Boolean isUnderLegalHold) {
    this.isUnderLegalHold = isUnderLegalHold;
    return this;
  }
  

  public Boolean isIsUnderLegalHold() {
    return isUnderLegalHold;
  }

  public void setIsUnderLegalHold(Boolean isUnderLegalHold) {
    this.isUnderLegalHold = isUnderLegalHold;
  }

  public LegalHoldInfo lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalHoldInfo legalHoldInfo = (LegalHoldInfo) o;
    return Objects.equals(this.isUnderLegalHold, legalHoldInfo.isUnderLegalHold) &&
        Objects.equals(this.lastModifiedTime, legalHoldInfo.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(isUnderLegalHold, lastModifiedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalHoldInfo {\n");
    
    sb.append("    isUnderLegalHold: ").append(toIndentedString(isUnderLegalHold)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
