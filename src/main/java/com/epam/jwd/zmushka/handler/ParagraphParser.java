package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Paragraph;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements Parser {

    private static ParagraphParser instance;
    private final Parser nextParser = SentenceParser.getInstance();
    private static final String SENTENCE_REGEXP = "[A-Z].+?[.{3}!?]";

    private ParagraphParser() {
    }

    public static ParagraphParser getInstance() {
        if (instance == null) {
            instance = new ParagraphParser();
        }
        return instance;
    }

    public Parser getNextParser() {
        return nextParser;
    }

    @Override
    public Component handleRequest(String paragraph) {
        Component paragraphComponent = new Paragraph();
        List<String> sentences = parseParagraph(paragraph);

        for (String sentence : sentences) {
            paragraphComponent.addComponent(nextParser.handleRequest(sentence));
        }
        return paragraphComponent;
    }

    private List<String> parseParagraph(String paragraph) {
        List<String> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile(SENTENCE_REGEXP);
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            sentences.add(matcher.group());
        }
        return sentences;
    }

}
