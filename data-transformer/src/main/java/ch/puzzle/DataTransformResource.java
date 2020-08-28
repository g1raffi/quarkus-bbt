package ch.puzzle;

import ch.puzzle.entity.BbtDataObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/data")
public class DataTransformResource {

    private final Logger logger = Logger.getLogger(DataTransformResource.class.getName());

    @GET
    public BbtDataObject getDataObject() {
        BbtDataObject object = new BbtDataObject();
        object.value = Math.random();
        return object;
    }

    @POST
    public Response postDataObject(BbtDataObject object) {
        logger.info(object.value.toString());
        return Response.ok(object).build();
    }
}