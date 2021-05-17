package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Sentence;

public class SentenceParser implements Parser {

    private static SentenceParser instance;
    private final Parser nextParser = LexemeParser.getInstance();

    private SentenceParser() {
    }

    public static SentenceParser getInstance() {
        if (instance == null) {
            instance = new SentenceParser();
        }
        return instance;
    }

    public Parser getNextParser() {
        return nextParser;
    }

    @Override
    public Component handleRequest(String string) {
        Component sentenceComponent = new Sentence();
        String[] lexemes = string.split(" ");

        for (String lexeme : lexemes) {
            sentenceComponent.addComponent(nextParser.handleRequest(lexeme));
        }
        return sentenceComponent;
    }

}
