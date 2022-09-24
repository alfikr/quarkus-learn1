package com.jasavast.learn1.domain;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Community extends PanacheEntityBase {
    @Id
    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;
    @NotNull
    private String name;

}
