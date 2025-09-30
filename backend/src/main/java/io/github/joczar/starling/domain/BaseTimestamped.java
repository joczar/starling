package io.github.joczar.starling.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseTimestamped {
    @CreationTimestamp
    LocalDateTime creationDate;
    @UpdateTimestamp
    LocalDateTime updateDate;
}
