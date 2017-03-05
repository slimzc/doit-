package com.airhacks.doit.business.reminders.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by fcastilla on 3/2/17.
 */
@Path("todos")
public class TodosResource {

  @GET
  public String hello(){
    return "hello world at: " + System.currentTimeMillis();
  }
}
