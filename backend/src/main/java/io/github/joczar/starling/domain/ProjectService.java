package io.github.joczar.starling.domain;

public interface ProjectService {

    ProjectResponse getProjectById(Long projectId);

    void createProject(ProjectRequest projectRequest);

    ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest);

    void deleteProjectById(Long projectId);
}
