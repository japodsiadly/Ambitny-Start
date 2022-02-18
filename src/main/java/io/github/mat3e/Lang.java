package io.github.mat3e;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
// POJO - Plain Old Java Object - prywatne pola z geterami i seterami - Struktura danych nie klasa
class Lang {
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

    public Lang(final Integer id, final String welcomeMessage, final String languageCode) {
        this.id = id;
        this.welcomeMsg = welcomeMessage;
        this.code = languageCode;
    }

    public Integer getId() {
        return id;
    }

    public String getWelcomeMessage() {
        return welcomeMsg;
    }

    public void setWelcomeMessage(final String welcomeMessage) {
        this.welcomeMsg = welcomeMessage;
    }

    public String getLanguageCode() {
        return code;
    }

    public void setLanguageCode(final String languageCode) {
        this.code = languageCode;
    }
}
