package com.moeller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

/**
 * Created by Bernd on 22.10.2016.
 */
@Path("loadb")
public class LoadbResource {

    @GET
    public String get(){
        return "Hello World " + System.currentTimeMillis();
    }
}




