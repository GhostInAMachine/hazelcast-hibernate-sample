package com.hazelcast.l2c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        final DummyRepository repository = context.getBean(DummyRepository.class);

        final ConcreteEntity entity = new ConcreteEntity();
        entity.setSomething("xyz");
        entity.setText("bar");
        entity.setNumber(1);
        repository.save(entity);

        /*
        If everything works as expected you should only observe a single SQL
        statement being printed to the STDOUT
         */

        final AbstractEntity one = repository.findByTextAndNumber("bar", 1);
        final AbstractEntity two = repository.findByTextAndNumber("bar", 1);
    }
}
