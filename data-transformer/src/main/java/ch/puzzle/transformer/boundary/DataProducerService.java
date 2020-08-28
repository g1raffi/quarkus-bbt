package ch.puzzle.transformer.boundary;

import ch.puzzle.consumer.entity.BbtDataObject;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/data")
@RegisterRestClient(configKey = "data-producer")
public interface DataProducerService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    BbtDataObject getData();
}
