package org.fhir.imagin;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by jstockhausen on 12.11.2016.
 */
public class TestFhirClient
{

  @Test
  public void name() throws Exception
  {
    assertThat(1, is(equalTo(1)));
  }
}
