package domain;

import com.google.api.Page;

import javax.enterprise.context.ApplicationScoped;
import java.awt.print.Pageable;
import java.util.List;

@ApplicationScoped
public class CandidateService {
    private final CandidateRepository repository;

    public CandidateService(CandidateRepository repository) {
        this.repository = repository;
    }

    public void save(Candidate domain) {
        repository.save(domain);
    }

    public List<Candidate> findAll() {
        return repository.findAll();
    }
    public Candidate findById(String id) {
        return repository.findById(id).orElseThrow();
    }


    public void delete(String id){
        repository.delete(id);
    }


}
