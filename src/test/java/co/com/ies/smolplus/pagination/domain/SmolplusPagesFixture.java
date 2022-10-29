package co.com.ies.smolplus.pagination.domain;

import java.util.List;

import co.com.ies.smolplus.pagination.domain.SmolplusPage.SmolplusPageBuilder;

public final class SmolplusPagesFixture {

  private SmolplusPagesFixture() {}

  public static SmolplusPage<String> page() {
    return pageBuilder().build();
  }

  public static SmolplusPageBuilder<String> pageBuilder() {
    return SmolplusPage.builder(List.of("test")).currentPage(2).pageSize(10).totalElementsCount(21);
  }
}
