package domain;

import java.util.Optional;

public record Candidato(String id,
                        Optional<String> foto,
                        String nome,
                        String sobrenome,
                        String email,
                        Optional<String> telefone,
                        Optional<String> ocupacao) {
}
