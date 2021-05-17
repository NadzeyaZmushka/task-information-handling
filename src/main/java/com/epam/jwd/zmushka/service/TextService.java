package com.epam.jwd.zmushka.service;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Composite;

import java.util.Comparator;
import java.util.List;

public class TextService {

    private static TextService instance;

    private TextService() {
    }

    public static TextService getInstance() {
        if (instance == null) {
            instance = new TextService();
        }
        return instance;
    }

    public Component sortParagraphsByAmountOfSentence(Component component) {
        List<Component> listOfParagraphs = component.getComponents();
        listOfParagraphs.sort(Comparator.comparingInt(Component::getAmountOfComponents));
        return new Composite(listOfParagraphs);
    }

    public Component sortSentencesByLengthOfWords(Component component) {
        List<Component> listOfSentences = component.getComponents();
        listOfSentences.sort(Comparator.comparingInt(Component::getAmountOfComponents));
        return new Composite(listOfSentences);
    }

}
