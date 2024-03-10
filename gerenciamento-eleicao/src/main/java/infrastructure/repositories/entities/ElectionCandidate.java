package infrastructure.repositories.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "election_candidate")
public class ElectionCandidate {
    @EmbeddedId
    private ElectionCandidadeteId id;
    private Integer votes;

    public ElectionCandidadeteId getId() {
        return id;
    }

    public void setId(ElectionCandidadeteId id) {
        this.id = id;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public static ElectionCandidate fromDomain(domain.Election election, domain.Candidate candidate, Integer votes){
        ElectionCandidate entity = new ElectionCandidate();

        ElectionCandidadeteId id = new ElectionCandidadeteId();
        id.setElectionId(election.id());
        id.setCandidateId(id.getCandidateId());

        entity.setId(id);
        entity.setVotes(votes);

        return entity;
    }
}
