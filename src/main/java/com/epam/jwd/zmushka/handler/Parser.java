package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;

public interface Parser {

    Component handleRequest(String string);

}
