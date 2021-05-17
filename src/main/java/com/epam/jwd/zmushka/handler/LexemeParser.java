package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Lexeme;
import com.epam.jwd.zmushka.composite.Symbol;

public class LexemeParser implements Parser {

    private static LexemeParser instance;

    private static final String LEXEME_REGEX ="\\s";

    private LexemeParser() {
    }

    public static LexemeParser getInstance() {
        if (instance == null) {
            instance = new LexemeParser();
        }
        return instance;
    }

    @Override
    public Component handleRequest(String string) {
        Component lexemeComponent = new Lexeme();
        String[] symbols = string.split(LEXEME_REGEX);

        for (String symbol : symbols) {
            lexemeComponent.addComponent(new Symbol(symbol));
        }
        return lexemeComponent;
    }

}
