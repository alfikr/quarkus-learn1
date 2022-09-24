package com.jasavast.learn1.domain;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Cacheable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends PanacheEntity {
    @Id
    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @ManyToOne
    private Community community;
}
