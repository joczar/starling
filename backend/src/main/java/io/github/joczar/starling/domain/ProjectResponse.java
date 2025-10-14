package io.github.joczar.starling.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectResponse {
    String name;
    LocalDateTime creationDate;
    LocalDateTime updateDate;
}
