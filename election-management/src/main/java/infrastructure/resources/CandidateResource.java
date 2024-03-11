package infrastructure.resources;

import api.CandidateApi;
import api.dto.in.CreateCandidate;
import api.dto.in.UpdateCandidate;
import api.dto.out.Candidate;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestResponse;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.print.Pageable;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/candidates")
public class CandidateResource {
    private final CandidateApi api;

    public CandidateResource(CandidateApi candidateApi){
        this.api = candidateApi;
    }

    @POST
    @ResponseStatus(RestResponse.StatusCode.CREATED)
    @Transactional
    public void create(CreateCandidate dto){
        api.create(dto);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Candidate update(@PathParam("id") String id, UpdateCandidate dto){
        return api.update(id, dto);
    }

    @GET
    @ResponseStatus(RestResponse.StatusCode.OK)
    public List<Candidate> list(){
        return api.list();
    }

    @GET
    @Path("/page{page}/limit{limit}")
    @ResponseStatus(RestResponse.StatusCode.OK)
    public List<Candidate> list(@PathParam("page")Integer page, @PathParam("limit")Integer limit){
        return api.listPagination(page, limit);
    }

    @DELETE
    @Path("/{id}")
    @ResponseStatus(RestResponse.StatusCode.OK)
    public void delete(@PathParam("id") String id){
        api.delete(id);
    }


}
