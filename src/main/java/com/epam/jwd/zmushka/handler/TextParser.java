package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Composite;

public class TextParser implements Parser {

    private static TextParser instance;
    private final Parser nextParser = ParagraphParser.getInstance();
    private static final String SPLITERATOR_REGEXP = " {4}";

    private TextParser() {
    }

    public static TextParser getInstance() {
        if (instance == null) {
            instance = new TextParser();
        }
        return instance;
    }

    @Override
    public Component handleRequest(String string) {
        Component textComponent = new Composite();

        String[] paragraphs = string.trim().split(SPLITERATOR_REGEXP);
        for (String paragraph : paragraphs) {
            textComponent.addComponent(nextParser.handleRequest(paragraph));
        }
        return textComponent;
    }

}
