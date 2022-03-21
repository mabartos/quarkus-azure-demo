package org.mabartos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String printName(@QueryParam("name") String name) {
        return "Hi, " + Optional.ofNullable(name).orElse("stranger (define query param 'name')") + "!";
    }
}