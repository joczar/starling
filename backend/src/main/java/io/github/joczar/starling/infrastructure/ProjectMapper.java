package io.github.joczar.starling.infrastructure;

import io.github.joczar.starling.domain.Project;
import io.github.joczar.starling.domain.ProjectRequest;
import io.github.joczar.starling.domain.ProjectResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {

    ProjectResponse entityToResponse(Project project);

    Project requestToEntity(ProjectRequest projectRequest);

    Project updateProject(@MappingTarget Project project, ProjectRequest projectRequest);
}
