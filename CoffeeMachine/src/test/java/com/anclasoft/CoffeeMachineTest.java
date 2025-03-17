package com.anclasoft;

import com.anclasoft.utils.TextUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

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
    @DisplayName("Testing execute method with Admin option checking ingredients")
    void testingExecuteMethodWithAdminOptionCheckIngredients() {
        String input = "2\n1\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = """
                %s
                %s
                Checking Ingredients
                %s
                Bye
                """.formatted(TextUtils.SHOW_WELCOME, TextUtils.PRINT_ADMIN_OPTIONS, TextUtils.SHOW_WELCOME);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Testing execute method with Admin option Refilling machine")
    void testingExecuteMethodWithAdminOptionRefilling() {
        String input = "2\n2\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = """
                %s
                %s
                Refilling...
                %s
                Bye
                """.formatted(TextUtils.SHOW_WELCOME, TextUtils.PRINT_ADMIN_OPTIONS, TextUtils.SHOW_WELCOME);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Testing execute method with Admin option display levels")
    void testingExecuteMethodWithAdminOptionDisplayLevels() {
        String input = "2\n3\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = """
                %s
                %s
                Display Levels
                %s
                Bye
                """.formatted(TextUtils.SHOW_WELCOME, TextUtils.PRINT_ADMIN_OPTIONS, TextUtils.SHOW_WELCOME);
        assertEquals(expectedOutput, outContent.toString());
    }

    @ParameterizedTest(name = "Testing admin option invalid number: {0}")
    @ValueSource(ints = {-1, 6})
    void testingAdminOptionWithInvalidNumber(int option) {
        String input = "2\n%d\n0\n0\n".formatted(option);
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = """
                %s
                %s
                Invalid Admin Option
                %s
                Bye
                """.formatted(TextUtils.SHOW_WELCOME, TextUtils.PRINT_ADMIN_OPTIONS, TextUtils.SHOW_WELCOME);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Testing admin option number 0")
    void testingAdminOptionWithCeroNumber() {
        String input = "2\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.execute();

        String expectedOutput = """
                %s
                %s
                %s
                Bye
                """.formatted(TextUtils.SHOW_WELCOME, TextUtils.PRINT_ADMIN_OPTIONS, TextUtils.SHOW_WELCOME);
        assertEquals(expectedOutput, outContent.toString());
    }
}
