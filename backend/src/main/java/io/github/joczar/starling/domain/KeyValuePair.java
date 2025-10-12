package io.github.joczar.starling.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class KeyValuePair extends BaseTimestamped {
    String name;
    String value;
}
