package com.epam.jwd.zmushka.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Symbol implements Component {

    private final String symbol;
    private static final Logger LOGGER = LogManager.getLogger(Symbol.class);

    public Symbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void addComponent(Component component) {
        LOGGER.error("It is not possible to add component");
//        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(Component component) {
        LOGGER.error("It is not possible to remove component");
//        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getComponents() {
        return Collections.singletonList(this);
    }

    @Override
    public int getAmountOfComponents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol1 = (Symbol) o;
        return Objects.equals(symbol, symbol1.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

}
