package org.fhir.app;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jstockhausen on 12.11.2016.
 */
public class ImagingApplication
{
  private static final Logger LOG = LoggerFactory.getLogger(ImagingApplication.class);

  public static void main(String[] args)
  {
    LOG.info("starting with param");

    for (String arg : args)
    {
      LOG.info(" [{}]", arg);
    }

    ImagingApplication imagingApplication = new ImagingApplication();
    imagingApplication.execute(args);
  }

  private Options options;

  public ImagingApplication()
  {
    // ILB
  }

  private CommandLine initOptions(String[] args)
  {
    options = new Options();
    options.addOption("h", false, "help");
    options.addOption("s", true, "server base");

    CommandLineParser parser = new DefaultParser();
    CommandLine cmd = null;

    try
    {

      cmd = parser.parse(options, args);
    }
    catch (ParseException e)
    {
      LOG.error("error parsing cli", e);
    }

    return cmd;
  }

  private void execute(String[] args)
  {
    CommandLine cmd = initOptions(args);

    if (cmd.hasOption("h"))
    {
      HelpFormatter formatter = new HelpFormatter();
      formatter.printHelp( "ImaginApp", options );

      return;
    }

    if(cmd.hasOption("s"))
    {
      String serverBase = cmd.getOptionValue("s");

      QueryData queryData = new QueryData(serverBase);

      queryData.execute();

      return;
    }


  }
}
