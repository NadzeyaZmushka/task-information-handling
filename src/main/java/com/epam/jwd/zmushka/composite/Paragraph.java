package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paragraph implements Component {

    private final List<Component> sentences = new ArrayList<>();

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
