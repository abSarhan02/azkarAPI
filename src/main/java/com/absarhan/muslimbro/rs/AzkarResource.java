package com.absarhan.muslimbro.rs;

import com.absarhan.muslimbro.business.AzkarManager;
import com.absarhan.muslimbro.model.Azkar;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/azkar")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AzkarResource {

    private final AzkarManager azkarManager = new AzkarManager();

    @GET
    @Path("/")
    public Response getAllAzkar() {
        List<Azkar> azkarList = azkarManager.getAllAzkar();
        return Response.ok(azkarList).build();
    }

    @GET
    @Path("/{id}")
    public Response getAzkarById(@PathParam("id") Long id) {
        Azkar azkar = azkarManager.getAzkarById(id);
        if (azkar != null) {
            return Response.ok(azkar).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response createAzkar(Azkar azkar) {
        azkarManager.saveAzkar(azkar);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateAzkar(@PathParam("id") Long id, Azkar azkar) {
        if (!id.equals(azkar.getId())) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        azkarManager.updateAzkar(azkar);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAzkar(@PathParam("id") Long id) {
        azkarManager.deleteAzkar(id);
        return Response.ok().build();
    }
}
