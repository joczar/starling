package io.github.joczar.starling.infrastructure;

import io.github.joczar.starling.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectJpaRepository extends JpaRepository<Project, Long> {
}
