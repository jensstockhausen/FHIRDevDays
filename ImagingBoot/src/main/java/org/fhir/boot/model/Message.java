package org.fhir.boot.model;

/**
 * Created by jstockhausen on 12.11.2016.
 */
public class Message
{
  private String message;

  public Message(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }
}
