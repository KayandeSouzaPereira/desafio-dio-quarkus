package infrastructure.repositories;

import domain.Candidato;
import domain.CandidatoRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class SQLCandidatoRepository implements CandidatoRepository {

    @Override
    public void save(List<Candidato> candidatos){

    }

    @Override
    public List<Candidato> findAll(){
        return List.of();
    }
}
