package co.com.ies.smol.pagination.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import co.com.ies.smol.common.domain.Generated;
import co.com.ies.smol.error.domain.Assert;

public class SmolplusPageable {

  private final int page;
  private final int pageSize;
  private final int offset;

  public SmolplusPageable(int page, int pageSize) {
    Assert.field("page", page).min(0);
    Assert.field("pageSize", pageSize).min(1).max(100);

    this.page = page;
    this.pageSize = pageSize;
    offset = page * pageSize;
  }

  public int page() {
    return page;
  }

  public int pageSize() {
    return pageSize;
  }

  public int offset() {
    return offset;
  }

  @Override
  @Generated
  public int hashCode() {
    return new HashCodeBuilder().append(page).append(pageSize).build();
  }

  @Override
  @Generated
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    SmolplusPageable other = (SmolplusPageable) obj;
    return new EqualsBuilder().append(page, other.page).append(pageSize, other.pageSize).build();
  }
}
