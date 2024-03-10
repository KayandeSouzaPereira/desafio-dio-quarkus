package api.dto.in;

import api.CandidateApi;
import domain.Candidate;

import java.util.Optional;

public record CreateCandidate(Optional<String> photo,
                              String givemName,
                              String familyName,
                              String email,
                              Optional<String> phone,
                              Optional<String> jobTitle) {
    public Candidate toDomain(){
        return Candidate.create(photo,givemName,familyName,email,phone,jobTitle);
    }
}
