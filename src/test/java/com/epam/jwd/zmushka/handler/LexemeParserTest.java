package com.epam.jwd.zmushka.handler;

import com.epam.jwd.zmushka.composite.Component;
import com.epam.jwd.zmushka.composite.Lexeme;
import com.epam.jwd.zmushka.composite.Symbol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LexemeParserTest {

    @Test
    public void testHandleRequest_returnsLexemeComponent() {

        String lexeme = "Hey!";

        Component actual = LexemeParser.getInstance().handleRequest(lexeme);

        Component symbol1 = new Symbol("H");
        Component symbol2 = new Symbol("e");
        Component symbol3 = new Symbol("y");
        Component symbol4 = new Symbol("!");

        Component expected = new Lexeme();

        expected.addComponent(symbol1);
        expected.addComponent(symbol2);
        expected.addComponent(symbol3);
        expected.addComponent(symbol4);

        assertEquals(expected, actual);
    }

}