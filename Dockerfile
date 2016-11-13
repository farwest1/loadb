# FROM airhacks/payara
FROM jboss/wildfly
#COPY ./target/loadb.war ${DEPLOYMENT_DIR}
ADD ./target/loadb.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8080 8443 9990
MAINTAINER Bernd Moeller <moeller-bernd@gmx.de>
RUN /opt/jboss/wildfly/bin/add-user.sh admin ZR20010$%! --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
