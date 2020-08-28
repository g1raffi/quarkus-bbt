package ch.puzzle;

import ch.puzzle.entity.BbtDataObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("/data")
public class DataConsumerResource {

    private final Logger logger = Logger.getLogger(DataConsumerResource.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BbtDataObject getBbtDatObject() {
        BbtDataObject object = new BbtDataObject();
        object.value = Math.random();

        logger.info(object.value.toString());

        return object;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postDataObject(BbtDataObject data) {
        logger.info(data.value.toString());
        return Response.ok(data).build();
    }

}
