package domain;


import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@QuarkusTest
class CandidatoServiceTest {

    @Inject
    CandidatoService service;

    @InjectMock
    CandidatoRepository repository;

    @Test
    void save(){
        Candidato candidato = Instancio.create(Candidato.class);

        service.save(candidato);

        verify(repository).save(candidato);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll() {
        service.findAll();
    }


}