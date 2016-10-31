package com.hazelcast.l2c;

import javax.persistence.*;

@MappedSuperclass
@IdClass(CompositeKey.class)
public abstract class AbstractEntity {

    @Id
    private String text;

    @Id
    private Integer number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
