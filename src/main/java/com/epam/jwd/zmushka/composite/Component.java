package com.epam.jwd.zmushka.composite;

import java.util.List;

public interface Component {

    void addComponent(Component component);

    void removeComponent(Component component);

    List<Component> getComponents();

    int getAmountOfComponents();

    String getString();

    ComponentType getComponentType();

}
