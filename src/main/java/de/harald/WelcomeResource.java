package de.harald;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.quarkus.security.Authenticated;

@Authenticated
@Path("/hello")
public class WelcomeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("test") String test, @QueryParam("code") String code) {
        return "test: " + test + ", code: " + code;
    }
}