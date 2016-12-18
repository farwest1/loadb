package com.moeller.rest.api;

import com.moeller.security.UserHasRight;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Bernd on 22.10.2016.
 */
@Path("loadb")
public class LoadbResource {

    @GET
    @UserHasRight
    public String get(){
        //return "Hello World " + System.currentTimeMillis();
        return LocalDateTime.now().toString();
    }
}




