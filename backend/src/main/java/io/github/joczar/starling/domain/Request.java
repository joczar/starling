package io.github.joczar.starling.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Request extends BaseTimestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Enumerated(EnumType.STRING)
    RequestMethod requestType;
    String protocol;
    String host;
    String uri;
    String body;
    @ManyToOne
    Project project;
    @ManyToOne
    Label label;
    @OneToMany
    List<Parameter> parameters;
    @OneToMany
    List<Header> headers;
}
