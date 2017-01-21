package com.moeller.wildfly;

import org.wildfly.swarm.datasources.DatasourcesFraction;

/**
 * Created by Bernd on 21.01.2017.
 *
 * Package com.moeller.wildfly
 */
public class MyMain {

  public static void main(String...args){
     new DatasourcesFraction()
        .jdbcDriver("org.postgresql", (d) -> {
          d.driverClassName("org.postgresql.Driver");
          d.xaDatasourceClass("org.postgresql.xa.PGXADataSource");
          d.driverModuleName("org.postgresql");
        })
        .dataSource("ExampleDS", (ds) -> {
          ds.driverName("org.postgresql");
          ds.connectionUrl(System.getenv("JDBC_DATASOURCE_URL"));
        });

  }

}
