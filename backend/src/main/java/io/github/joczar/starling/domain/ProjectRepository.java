package io.github.joczar.starling.domain;

import java.util.Optional;

public interface ProjectRepository {

    Project save(Project project);

    Optional<Project> findById(Long id);

    void delete(Project project);
}
