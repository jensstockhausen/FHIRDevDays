package org.fhir.boot.services;

import org.fhir.boot.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jstockhausen on 12.11.2016.
 */
@RestController
public class Ping
{

  @RequestMapping(path="/ping", method = RequestMethod.GET)
  public Message ping()
  {
    return new Message("pong");
  }

  @RequestMapping(path="/greet/{name}", method = RequestMethod.GET)
  public Message greet(@PathVariable("name") String name)
  {
    return new Message("Hello " + name);
  }

}
