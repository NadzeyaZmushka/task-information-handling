package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements Component {

    private final List<Component> lexemes = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
//        if (component == null) {
//            throw new NoSuchElementException();
//        }
        lexemes.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        lexemes.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return lexemes;
    }

    @Override
    public int getAmountOfComponents() {
        return lexemes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(lexemes, sentence.lexemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexemes);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "lexemes=" + lexemes +
                '}';
    }

}
