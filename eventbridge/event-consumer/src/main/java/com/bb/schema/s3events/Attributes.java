package com.bb.schema.s3events;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.io.Serializable;

public class Attributes implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("creationDate")
  private Date creationDate = null;

  @JsonProperty("mfaAuthenticated")
  private String mfaAuthenticated = null;

  public Attributes creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }
  

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Attributes mfaAuthenticated(String mfaAuthenticated) {
    this.mfaAuthenticated = mfaAuthenticated;
    return this;
  }
  

  public String getMfaAuthenticated() {
    return mfaAuthenticated;
  }

  public void setMfaAuthenticated(String mfaAuthenticated) {
    this.mfaAuthenticated = mfaAuthenticated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.creationDate, attributes.creationDate) &&
        Objects.equals(this.mfaAuthenticated, attributes.mfaAuthenticated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(creationDate, mfaAuthenticated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    mfaAuthenticated: ").append(toIndentedString(mfaAuthenticated)).append("\n");
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
