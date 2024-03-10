package api.dto.out;

import java.util.Optional;

public record Candidate(
        String id,
        Optional<String> photo,
        String fullname,
        String email,
        Optional<String> phone,
        Optional<String> jobTitle
) {
    public static Candidate fromDomain(domain.Candidate candidate){
        return new Candidate(candidate.id(), candidate.photo(),
                candidate.givenName() + " " + candidate.familyName(),
                candidate.email(), candidate.phone(), candidate.jobTitle());
    }
}
