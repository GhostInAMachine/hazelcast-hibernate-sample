package com.hazelcast.l2c;

import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;

@Repository
public interface DummyRepository extends CrudRepository<ConcreteEntity, CompositeKey> {

    @QueryHints(value = {
            @QueryHint(name = "org.hibernate.cacheable", value = "true")
    })
    ConcreteEntity findByTextAndNumber(String text, Integer number);
}
