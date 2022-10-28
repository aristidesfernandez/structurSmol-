package co.com.ies.smol.pagination.infrastructure.secondary;

import java.util.function.Function;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import co.com.ies.smol.error.domain.Assert;
import co.com.ies.smol.pagination.domain.SmolplusPage;
import co.com.ies.smol.pagination.domain.SmolplusPageable;

public final class SmolplusPages {

  private SmolplusPages() {}

  public static Pageable from(SmolplusPageable pagination) {
    return from(pagination, Sort.unsorted());
  }

  public static Pageable from(SmolplusPageable pagination, Sort sort) {
    Assert.notNull("pagination", pagination);
    Assert.notNull("sort", sort);

    return PageRequest.of(pagination.page(), pagination.pageSize(), sort);
  }

  public static <S, T> SmolplusPage<T> from(Page<S> springPage, Function<S, T> mapper) {
    Assert.notNull("springPage", springPage);
    Assert.notNull("mapper", mapper);

    return SmolplusPage
      .builder(springPage.getContent().parallelStream().map(mapper).toList())
      .currentPage(springPage.getNumber())
      .pageSize(springPage.getSize())
      .totalElementsCount(springPage.getTotalElements())
      .build();
  }
}
