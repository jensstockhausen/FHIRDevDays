package org.fhir.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jstockhausen on 12.11.2016.
 */
@SpringBootApplication
public class Application
{
  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args)
  {
    LOG.info("running application");
    SpringApplication.run(Application.class, args);
  }
}
