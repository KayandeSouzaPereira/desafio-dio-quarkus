package domain;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CandidatoService {

    private final CandidatoRepository repository;

    public CandidatoService(CandidatoRepository repository){
        this.repository = repository;
    }

    public void save(Candidato candidato) {
        repository.save(candidato);
    }

    public List<Candidato> findAll() {
         return repository.findAll();
    }
}
