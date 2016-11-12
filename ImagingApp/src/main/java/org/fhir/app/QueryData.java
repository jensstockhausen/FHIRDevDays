package org.fhir.app;

import org.fhir.imaging.FhirClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jstockhausen on 12.11.2016.
 */
public class QueryData
{
  private static final Logger LOG = LoggerFactory.getLogger(QueryData.class);

  private String serverBase;
  private FhirClient fhirClient;

  public QueryData(String serverBase)
  {
    this.serverBase = serverBase;
    fhirClient = new FhirClient(serverBase);
  }

  public void execute()
  {
    LOG.info("execute query");
    fhirClient.doStuff();
  }

}
