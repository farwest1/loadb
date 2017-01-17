package com.moeller.business.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by Bernd on 16.01.2017.
 *
 * Package com.moeller.business.domain
 */
@Entity(name = "Event")
@TableGenerator(name = "gen", table="SHARED_SEQUENCES", initialValue=0, allocationSize=50)
@Table(name = "EVENT")
public class Event {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "gen")
  @Column(name="EV_ID")
  private long id;

  @Column(name = "EV_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @Column(name = "EV_TYPE")
  private int type;

  protected Event(){}

  public Event(int type){
    this.date = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
