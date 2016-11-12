package org.fhir.imaging;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.IGenericClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jstockhausen on 12.11.2016.
 */
public class FhirClient
{
  private static final Logger LOG = LoggerFactory.getLogger(FhirClient.class);

  private String serverBase;
  private IGenericClient client;

  public FhirClient(String serverBase)
  {
    LOG.info("create FHIR client for server [{}]", serverBase);
    this.serverBase = serverBase;
    FhirContext fhirContext = FhirContext.forDstu3();

    client = fhirContext.newRestfulGenericClient(serverBase);
  }

  public void doStuff()
  {
    LOG.info("doing stuff for server [{}]", serverBase);
  }


}
