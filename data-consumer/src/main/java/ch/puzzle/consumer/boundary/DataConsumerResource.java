package ch.puzzle.consumer.boundary;

import ch.puzzle.consumer.entity.BbtDataObject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("/data")
public class DataConsumerResource {

    private final Logger logger = Logger.getLogger(DataConsumerResource.class.getName());

    @RestClient
    DataTransformerService dataTransformerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BbtDataObject getBbtDatObject() {
        return dataTransformerService.getData();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postDataObject(BbtDataObject data) {
        logger.info(data.value.toString());
        return Response.ok(data).build();
    }



}
