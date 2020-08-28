package ch.puzzle.transformer.boundary;

import ch.puzzle.consumer.entity.BbtDataObject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/data")
public class DataTransformResource {

    private final Logger logger = Logger.getLogger(DataTransformResource.class.getName());

    @RestClient
    DataProducerService dataProducerService;

    @GET
    public BbtDataObject getDataObject() {
        return dataProducerService.getData();
    }

    @POST
    public Response postDataObject(BbtDataObject object) {
        logger.info(object.value.toString());
        return Response.ok(object).build();
    }
}
