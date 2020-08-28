package ch.puzzle;

import ch.puzzle.consumer.entity.BbtDataObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("/data")
public class DataProducerResource {

    private final Logger logger = Logger.getLogger(DataProducerResource.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BbtDataObject getDataObject() {
        BbtDataObject object = new BbtDataObject();
        object.value = Math.random();
        return object;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postDataObject(BbtDataObject object) {
        logger.info(object.value.toString());
        return Response.ok(object).build();
    }
}
