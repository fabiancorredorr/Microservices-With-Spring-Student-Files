package co.fabian.corredor.LabBoot1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import co.fabian.corredor.LabBoot1.model.Team;

@Repository
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team,Long>{

}
