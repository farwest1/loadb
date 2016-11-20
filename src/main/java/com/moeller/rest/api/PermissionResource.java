package com.moeller.rest.api;

import com.moeller.business.service.RightsAssignment;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Bernd on 20.11.2016.
 */
@ApplicationScoped
@Path("/permission")
public class PermissionResource {

    @Inject
    private RightsAssignment rightsAssignment;

    @GET
    public String getPermission(){
        rightsAssignment.toggleRight();
        return "perm";
    }
}
