package it.lucafarsetti.memsource.projects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/projects")
public class ProjectRestController {

	public ProjectRestController(ProjectService projectService) {
		this.projectService = projectService;
	}

	private final ProjectService projectService;

	@GetMapping
	public ResponseEntity<Projects> findAll(Page page) {

		Projects projects = this.projectService.findAll(page);
		return ResponseEntity.ok(projects);

	}

}