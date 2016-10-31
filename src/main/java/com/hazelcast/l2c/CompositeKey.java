package com.hazelcast.l2c;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompositeKey implements Serializable {

    public CompositeKey() {
    }

    public CompositeKey(String text, Integer number) {
        this.text = text;
        this.number = number;
    }

    private String text;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeKey that = (CompositeKey) o;

        if (!text.equals(that.text)) return false;
        return number.equals(that.number);

    }

    @Override
    public int hashCode() {
        int result = text.hashCode();
        result = 31 * result + number.hashCode();
        return result;
    }
}
