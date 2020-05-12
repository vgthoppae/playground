package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SessionContext implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private Attributes attributes = null;

  public SessionContext attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }
  

  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionContext sessionContext = (SessionContext) o;
    return Objects.equals(this.attributes, sessionContext.attributes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionContext {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
