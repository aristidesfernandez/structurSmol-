package co.com.ies.smol.error.domain;

public class AssertionException extends RuntimeException {

  public AssertionException(String message) {
    super(message);
  }
}
