package io.github.mat3e;

class Lang { // POJO - Plain Old Java Object - prywatne pola z geterami i seterami - Struktura danych nie klasa
    private Long id; // jest longiem, ale też i nullem
    private String welcomeMessage;
    private String languageCode;

    public Lang(final Long id, final String welcomeMessage, final String languageCode) {
        this.id = id;
        this.welcomeMessage = welcomeMessage;
        this.languageCode = languageCode;
    }

    public Long getId() {
        return id;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(final String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(final String languageCode) {
        this.languageCode = languageCode;
    }
}
