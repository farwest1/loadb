package com.moeller.rest.api;

import com.moeller.business.domain.Event;
import com.moeller.business.repository.EventRepository;
import com.moeller.security.UserHasRight;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Bernd on 22.10.2016.
 */
@Path("loadb")
public class LoadbResource {

  @Inject
  private EventRepository eventRepository;

  @GET
  @UserHasRight
  public String get(){
      //return "Hello World " + System.currentTimeMillis();
      Event ev = new Event(0);
      eventRepository.saveEvent(ev);
      return LocalDateTime.now().toString();
  }
}




