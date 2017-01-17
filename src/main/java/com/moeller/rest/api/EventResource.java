package com.moeller.rest.api;

import com.moeller.business.domain.Event;
import com.moeller.business.repository.EventRepository;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Bernd on 16.01.2017.
 *
 * Package com.moeller.rest.api
 */

@Path("events")
public class EventResource {

  @Inject
  private EventRepository eventRepository;


  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Event> get(){
    return eventRepository.findEvents();
  }

}
