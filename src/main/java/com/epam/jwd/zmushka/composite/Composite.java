package com.epam.jwd.zmushka.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composite implements Component {

    private List<Component> components = new ArrayList<>();
    private ComponentType componentType;

    public Composite() {
    }

    public Composite(ComponentType componentType) {
        this.componentType = componentType;
    }

    public Composite(List<Component> components) {
        this.components = components;
    }

    public Composite(List<Component> components, ComponentType componentType) {
        this.components = components;
        this.componentType = componentType;
    }

    @Override
    public void addComponent(Component component) {
//        if (component == null) {
//            throw new NoSuchElementException();
//        }
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
//        if (component == null) {
//            throw new NoSuchElementException();
//        }
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
        Composite composite = (Composite) o;
        return Objects.equals(components, composite.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public String toString() {
        return "Composite{" +
                "components=" + components +
                '}';
    }

}
