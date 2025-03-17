package com.anclasoft;

import com.anclasoft.utils.TextUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CoffeeMachineTest {
    private final PrintStream standardOut = System.out;
    private final InputStream standardIn = System.in;

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    @DisplayName("Testing execute method with exit")
    void testingExecuteMethod() {
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = TextUtils.SHOW_WELCOME + System.lineSeparator() + "Bye" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Testing execute method with User option")
    void testingExecuteMethodWithUserOption() {
        String input = "1\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = TextUtils.SHOW_WELCOME + System.lineSeparator() + "Buying coffee" + System.lineSeparator() + TextUtils.SHOW_WELCOME + System.lineSeparator() + "Bye" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Testing execute method with Admin option")
    void testingExecuteMethodWithAdminOption() {
        String input = "2\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = TextUtils.SHOW_WELCOME + System.lineSeparator() + TextUtils.PRINT_ADMIN_OPTIONS + System.lineSeparator() + TextUtils.SHOW_WELCOME + System.lineSeparator() + "Bye" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
