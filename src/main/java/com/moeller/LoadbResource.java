package com.moeller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Bernd on 22.10.2016.
 */
@Path("loadb")
public class LoadbResource {

    @GET
    public String get(){
        return "hello loadb1 " + System.currentTimeMillis();
    }
}




