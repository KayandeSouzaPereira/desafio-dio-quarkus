package api;

import api.dto.in.CreateCandidate;
import api.dto.in.UpdateCandidate;
import com.google.api.Page;
import domain.Candidate;
import domain.CandidateService;

import javax.enterprise.context.ApplicationScoped;
import java.awt.print.Pageable;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class CandidateApi {
    private final CandidateService service;

    public CandidateApi(CandidateService service){
        this.service = service;
    }

    public void create(CreateCandidate dto) {
        service.save(dto.toDomain());
    }

    public api.dto.out.Candidate update(String id, UpdateCandidate dto) {
        service.save(dto.toDomain(id));
        Candidate candidate = service.findById(id);
        return api.dto.out.Candidate.fromDomain(candidate);
    }

    public List<api.dto.out.Candidate> list() {
        return service.findAll().stream().map(api.dto.out.Candidate::fromDomain).toList();
    }

    public List<api.dto.out.Candidate> listPagination(Integer page, Integer limit) {
        List<api.dto.out.Candidate> list = service.findAll().stream().map(api.dto.out.Candidate::fromDomain).toList();

        if(page == 1){
            List<api.dto.out.Candidate> pageLimit = list.subList(0, limit);
            return pageLimit;
        }else if(page != 1){
            List<api.dto.out.Candidate> pageLimit = list.subList(page*limit, page*limit+limit);
            return pageLimit;
        }
        return null;
    }

    public void delete(String id){
        service.delete(id);
    }
}
