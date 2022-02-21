package io.github.mat3e.lang;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
// POJO - Plain Old Java Object - prywatne pola z geterami i seterami - Struktura danych nie klasa
public class Lang {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id; // jest longiem, ale też i nullem
    private String welcomeMsg;
    private String code;

    /**
     * Hibernate (JPA) needs it.
     */
    @SuppressWarnings("unused")
    public Lang() {
    }

    public Lang(final Integer id, final String welcomeMsg, final String code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(final String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
