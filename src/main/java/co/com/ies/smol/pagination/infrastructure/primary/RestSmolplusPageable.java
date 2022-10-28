package co.com.ies.smol.pagination.infrastructure.primary;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import io.swagger.v3.oas.annotations.media.Schema;
import co.com.ies.smol.common.domain.Generated;
import co.com.ies.smol.pagination.domain.SmolplusPageable;

@Schema(name = "SmolplusPageable", description = "Pagination information")
public class RestSmolplusPageable {

  private int page;
  private int pageSize = 10;

  @Generated
  public RestSmolplusPageable() {}

  public RestSmolplusPageable(int page, int pageSize) {
    this.page = page;
    this.pageSize = pageSize;
  }

  @Min(value = 0)
  @Schema(description = "Page to display (starts at 0)", example = "0")
  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  @Min(value = 1)
  @Max(value = 100)
  @Schema(description = "Number of elements on each page", example = "10")
  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public SmolplusPageable toPageable() {
    return new SmolplusPageable(page, pageSize);
  }
}
