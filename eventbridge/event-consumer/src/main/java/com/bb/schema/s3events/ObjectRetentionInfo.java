package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ObjectRetentionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("legalHoldInfo")
  private LegalHoldInfo legalHoldInfo = null;

  public ObjectRetentionInfo legalHoldInfo(LegalHoldInfo legalHoldInfo) {
    this.legalHoldInfo = legalHoldInfo;
    return this;
  }
  

  public LegalHoldInfo getLegalHoldInfo() {
    return legalHoldInfo;
  }

  public void setLegalHoldInfo(LegalHoldInfo legalHoldInfo) {
    this.legalHoldInfo = legalHoldInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectRetentionInfo objectRetentionInfo = (ObjectRetentionInfo) o;
    return Objects.equals(this.legalHoldInfo, objectRetentionInfo.legalHoldInfo);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(legalHoldInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectRetentionInfo {\n");
    
    sb.append("    legalHoldInfo: ").append(toIndentedString(legalHoldInfo)).append("\n");
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
