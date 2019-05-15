package com.sample.resources.users;

import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("users")
public class UserResource {

    @Operation(description = "Search users.")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 30));
        return Response.ok(users).build();
    }
}
