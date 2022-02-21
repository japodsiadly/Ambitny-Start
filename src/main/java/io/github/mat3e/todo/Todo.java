package io.github.mat3e.todo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "todos")
class Todo {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String text;
    private boolean done;

    /**
     * Hibernate (JPA) needs it.
     */
    @SuppressWarnings("unused")
    public Todo() {
    }

    public Todo(final Integer id, final String text, final boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }
}

