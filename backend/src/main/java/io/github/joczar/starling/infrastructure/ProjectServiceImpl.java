package io.github.joczar.starling.infrastructure;

import io.github.joczar.starling.domain.*;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    ProjectMapper projectMapper;
    ProjectRepository projectRepository;

    public ProjectResponse getProjectById(Long projectId) {
        return projectMapper.entityToResponse(projectRepository.findById(projectId)
                .orElseThrow(() -> new NoSuchElementException("Project not found - id: " + projectId)));
    }

    public void createProject(ProjectRequest projectRequest) {
        projectRepository.save(projectMapper.requestToEntity(projectRequest));
    }

    public ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new NoSuchElementException("Project not found - id: " + projectId));
        project = projectRepository.save(projectMapper.updateProject(project, projectRequest));
        return projectMapper.entityToResponse(project);
    }

    public void deleteProjectById(Long projectId) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new NoSuchElementException("Project not found - id: " + projectId));
        projectRepository.delete(project);
    }
}
