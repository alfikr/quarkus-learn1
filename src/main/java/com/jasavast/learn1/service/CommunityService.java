package com.jasavast.learn1.service;

import com.jasavast.learn1.domain.Community;
import io.smallrye.mutiny.Uni;
import org.hibernate.reactive.mutiny.Mutiny;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@ApplicationScoped
public class CommunityService {
    @Inject
    private Mutiny.SessionFactory sf;

    public Uni<Void> save(@NotNull String name){
        return sf.withTransaction(session -> session.persist(Community.builder()
                .name(name)));
    }
}
