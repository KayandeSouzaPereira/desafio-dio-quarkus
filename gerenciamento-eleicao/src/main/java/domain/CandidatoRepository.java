package domain;

import java.util.List;


public interface CandidatoRepository {

    void save(List<Candidato> candidatos);

    default void save(Candidato candidato) {
        save(List.of(candidato));
    }

    List<Candidato> findAll();
}
