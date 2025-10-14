package io.github.joczar.starling.infrastructure;

import io.github.joczar.starling.domain.Project;
import io.github.joczar.starling.domain.ProjectRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProjectRepositoryImpl implements ProjectRepository {
    ProjectJpaRepository projectJpaRepository;

    @Override
    public Project save(Project project) {
        return projectJpaRepository.save(project);
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectJpaRepository.findById(id);
    }

    @Override
    public void delete(Project project) {
        projectJpaRepository.delete(project);
    }
}
