package co.fabian.corredor.LabBoot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.fabian.corredor.LabBoot1.model.Team;
import co.fabian.corredor.LabBoot1.repository.TeamRepository;

//@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}

	@GetMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id) {
		return teamRepository.findById(id).get();	
	}
}
