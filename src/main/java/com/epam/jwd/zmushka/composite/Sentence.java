package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements Component {

    private List<Component> lexemes = new ArrayList<>();
    private ComponentType componentType;

    public Sentence() {
    }

    public Sentence(List<Component> lexemes) {
        this.lexemes = lexemes;
    }


    public Sentence(List<Component> lexemes, ComponentType componentType) {
        this.lexemes = lexemes;
        this.componentType = componentType;
    }

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
    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Component component : lexemes) {
            stringBuilder.append(component.getString());
        }
        return stringBuilder.toString();
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
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
