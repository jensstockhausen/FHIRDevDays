package org.fhir.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jstockhausen on 12.11.2016.
 */
@Component
public class CliRunner implements CommandLineRunner
{
  private static final Logger LOG = LoggerFactory.getLogger(CliRunner.class);

  @Override
  public void run(String... args) throws Exception
  {
    LOG.info("CliRunner started");
  }

}
