package co.com.ies.smol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import co.com.ies.smol.common.domain.Generated;

@SpringBootApplication
@Generated(reason = "Not testing logs")
public class SmolplusApp {

  private static final Logger log = LoggerFactory.getLogger(SmolplusApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(SmolplusApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
