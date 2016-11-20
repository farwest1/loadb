package com.moeller.rest.api;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Bernd on 20.11.2016.
 */
@ApplicationScoped
@Path("/permission")
public class PermissionResource {

    @GET
    public String getPermission(){
        return "perm";
    }
}
