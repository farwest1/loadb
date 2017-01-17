package com.moeller.business.repository;

import com.moeller.business.domain.Event;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by Bernd on 16.01.2017.
 *
 * Package com.moeller.business.repository
 */
@ApplicationScoped
@Transactional
public class EventRepository {

  @PersistenceContext(unitName = "primary")
  private EntityManager entityManager;

  public void saveEvent(Event event){
    entityManager.persist(event);
  }

  public List<Event> findEvents(){
    Query query = entityManager.createQuery("select e from Event e");
    return (List<Event>) query.getResultList();
  }



}
