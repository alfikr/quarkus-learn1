package com.jasavast.learn1.resources;

import io.smallrye.mutiny.Uni;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class HelloResources {

    @GET
    public Uni<String> helloCommunity(){
        return Uni.createFrom().item("coba world");
    }
}
