package io.github.mat3e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

class HelloService {
    static final String FALLBACK_NAME = "World";
    static final Lang FALLBACK_LANG = new Lang(1, "Hello", "en");
    private final Logger logger = LoggerFactory.getLogger(HelloService.class);


    private final LangRepository repository;

    HelloService() {
        this(new LangRepository());
    }

    HelloService(LangRepository repository) {
        this.repository = repository;
    }

    String prepareGreeting(String name, String langId) {
        Integer langIdNum;

        try {
            langIdNum = Optional.ofNullable(langId).map(Integer::valueOf).orElse(FALLBACK_LANG.getId());
        } catch (NumberFormatException e) {
            logger.warn("Non-numeric language id used: " + langId);
            langIdNum = FALLBACK_LANG.getId();
        }

        var welcomeMessage = repository.findById(langIdNum).orElse(FALLBACK_LANG).getWelcomeMessage();
        var nameToWelcome = Optional.ofNullable(name).orElse(FALLBACK_NAME);
        return welcomeMessage + " " + nameToWelcome + "!";
    }
}
