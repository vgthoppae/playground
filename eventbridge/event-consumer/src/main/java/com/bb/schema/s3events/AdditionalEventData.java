package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AdditionalEventData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("objectRetentionInfo")
  private ObjectRetentionInfo objectRetentionInfo = null;

  @JsonProperty("x-amz-id-2")
  private String xAmzId2 = null;

  public AdditionalEventData objectRetentionInfo(ObjectRetentionInfo objectRetentionInfo) {
    this.objectRetentionInfo = objectRetentionInfo;
    return this;
  }
  

  public ObjectRetentionInfo getObjectRetentionInfo() {
    return objectRetentionInfo;
  }

  public void setObjectRetentionInfo(ObjectRetentionInfo objectRetentionInfo) {
    this.objectRetentionInfo = objectRetentionInfo;
  }

  public AdditionalEventData xAmzId2(String xAmzId2) {
    this.xAmzId2 = xAmzId2;
    return this;
  }
  

  public String getXAmzId2() {
    return xAmzId2;
  }

  public void setXAmzId2(String xAmzId2) {
    this.xAmzId2 = xAmzId2;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalEventData additionalEventData = (AdditionalEventData) o;
    return Objects.equals(this.objectRetentionInfo, additionalEventData.objectRetentionInfo) &&
        Objects.equals(this.xAmzId2, additionalEventData.xAmzId2);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(objectRetentionInfo, xAmzId2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalEventData {\n");
    
    sb.append("    objectRetentionInfo: ").append(toIndentedString(objectRetentionInfo)).append("\n");
    sb.append("    xAmzId2: ").append(toIndentedString(xAmzId2)).append("\n");
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
