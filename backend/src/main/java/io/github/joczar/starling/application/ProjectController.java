package io.github.joczar.starling.api;

import io.github.joczar.starling.domain.ProjectRequest;
import io.github.joczar.starling.domain.ProjectResponse;
import io.github.joczar.starling.domain.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("projects")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectController {

    ProjectService projectService;

    @GetMapping("{projectId}")
    public ProjectResponse getProjectById(@PathVariable Long projectId) {
        return projectService.getProjectById(projectId);
    }

    @PostMapping
    public void createProject(@RequestBody ProjectRequest projectRequest) {
        projectService.createProject(projectRequest);
    }

    @PutMapping("{projectId}")
    public ProjectResponse updateProject(@PathVariable Long projectId, @RequestBody ProjectRequest projectRequest) {
        return projectService.updateProject(projectId, projectRequest);
    }

    @DeleteMapping("{projectId}")
    public void deleteProjectById(@PathVariable Long projectId) {
        projectService.deleteProjectById(projectId);
    }

}
