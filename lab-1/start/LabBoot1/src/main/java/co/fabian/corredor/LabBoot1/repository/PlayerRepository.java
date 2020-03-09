package co.fabian.corredor.LabBoot1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import co.fabian.corredor.LabBoot1.model.Players;

@Repository
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Players,Long>{

}
