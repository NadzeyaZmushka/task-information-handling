package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lexeme implements Component {

    private List<Component> components = new ArrayList<>();
    private ComponentType componentType;

    public Lexeme() {
    }

    public Lexeme(ComponentType componentType) {
        this.componentType = componentType;
    }

    public Lexeme(List<Component> components) {
        this.components = components;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getAmountOfComponents() {
        return components.size();
    }

    @Override
    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Component component : components) {
            stringBuilder.append(component.getString());
        }
//        return stringBuilder.append(" ").toString();
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
        Lexeme lexeme = (Lexeme) o;
        return Objects.equals(components, lexeme.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public String toString() {
        return "Lexeme{" +
                "components=" + components +
                '}';
    }

}
