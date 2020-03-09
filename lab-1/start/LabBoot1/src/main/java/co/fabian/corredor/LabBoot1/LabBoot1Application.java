package co.fabian.corredor.LabBoot1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.fabian.corredor.LabBoot1.model.Players;
import co.fabian.corredor.LabBoot1.model.Team;
import co.fabian.corredor.LabBoot1.repository.TeamRepository;

@SpringBootApplication
public class LabBoot1Application {
	
	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(LabBoot1Application.class, args);
	}
	
	 @PostConstruct
	 public void init() {
	 List<Team> list = new ArrayList<>();

	 Set<Players> set = new HashSet<>();
	 set.add(new Players("Big Easy", "Showman"));
	 set.add(new Players("Buckets", "Guard"));
	 set.add(new Players("Dizzy", "Guard"));

	 list.add(new Team("Harlem", "Globetrotters", set));
	 list.add(new Team("Washington","Generals",null));

	 teamRepository.saveAll(list);
	 }
}
