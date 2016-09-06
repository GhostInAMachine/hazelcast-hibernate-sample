package com.hazelcast.l2c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        final DummyRepository repository = context.getBean(DummyRepository.class);

        final Iterable<DummyEntity> all = repository.findAll();

        /*
        If everything works as expected you should only observe a single SQL
        statement being printed to the STDOUT
         */

        final DummyEntity one = repository.findOne(1L);
    }
}
