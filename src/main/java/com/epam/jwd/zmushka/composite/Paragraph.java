package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paragraph implements Component {

    private List<Component> sentences = new ArrayList<>();
    private ComponentType componentType;

    public Paragraph() {
    }

    public Paragraph(ComponentType componentType) {
        this.componentType = componentType;
    }

    public Paragraph(List<Component> sentences) {
        this.sentences = sentences;
    }

    public Paragraph(List<Component> sentences, ComponentType componentType) {
        this.sentences = sentences;
        this.componentType = componentType;
    }

    @Override
    public void addComponent(Component component) {
//        if (component == null) {
//            throw new NoSuchElementException();
//        }
        sentences.add(component);
    }

    @Override
    public void removeComponent(Component component) {
//        if (component == null) {
//            throw new NoSuchElementException();
//        }
        sentences.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return sentences;
    }

    @Override
    public int getAmountOfComponents() {
        return sentences.size();
    }

    @Override
    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t");

        for (Component sentence : sentences) {
            stringBuilder.append(sentence.getString());
        }

//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("\n");

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
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "sentences=" + sentences +
                '}';
    }

}
