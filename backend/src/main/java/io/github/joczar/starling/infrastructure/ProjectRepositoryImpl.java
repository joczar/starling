package io.github.joczar.starling.infrastructure;

import io.github.joczar.starling.domain.ProjectRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProjectRepositoryImpl implements ProjectRepository {
    ProjectJpaRepository projectJpaRepository;
}
