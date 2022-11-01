package co.com.ies.smolplus.technical.infrastructure.primary.exception;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

/**
 * Utility class for HTTP headers creation.
 */
public final class HeaderUtil {

  private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

  private HeaderUtil() {}

   /**
   * <p>createFailureAlert.</p>
   *
   * @param applicationName a {@link String} object.
   * @param entityName a {@link String} object.
   * @param errorKey a {@link String} object.
   * @return a {@link HttpHeaders} object.
   */
  public static HttpHeaders createFailureAlert(
    String applicationName,
    String entityName,
    String errorKey
  ) {
    String message = "error." + errorKey;
    log.error("Entity processing failed, {}", message);

    HttpHeaders headers = new HttpHeaders();
    headers.add("X-" + applicationName + "-error", message);
    headers.add("X-" + applicationName + "-params", entityName);
    
    return headers;
  }

  public static HttpHeaders createEntityCreationAlert(String applicationName, boolean enableTranslation, String entityName, String param) {
    String message = enableTranslation ? applicationName + "." + entityName + ".created"
        : "A new " + entityName + " is created with identifier " + param;
    return createAlert(applicationName, message, param);
  }

public static HttpHeaders createAlert(String applicationName, String message, String param) {
    HttpHeaders headers = new HttpHeaders();
    headers.add("X-" + applicationName + "-alert", message);
    try {
        headers.add("X-" + applicationName + "-params", URLEncoder.encode(param, StandardCharsets.UTF_8.toString()));
    } catch (UnsupportedEncodingException e) {
        // StandardCharsets are supported by every Java implementation so this exception will never happen
    }
    return headers;
  }

  public static HttpHeaders createEntityUpdateAlert(String applicationName, boolean enableTranslation, String entityName, String param) {
    String message = enableTranslation ? applicationName + "." + entityName + ".updated"
        : "A " + entityName + " is updated with identifier " + param;
    return createAlert(applicationName, message, param);
  }

  public static HttpHeaders createEntityDeletionAlert(String applicationName, boolean enableTranslation, String entityName, String param) {
    String message = enableTranslation ? applicationName + "." + entityName + ".deleted"
        : "A " + entityName + " is deleted with identifier " + param;
    return createAlert(applicationName, message, param);
  }
}
