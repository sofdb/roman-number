////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    private static final String I_ASCII = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";
    private static final String V_ASCII = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";
    private static final String X_ASCII = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n";

    @Test
    public void print1ShouldReturnAsciiI() {
        // Arrange
        int number = 1;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(I_ASCII, result);
    }

    @Test
    public void print2ShouldReturnAsciiII() {
        // Arrange
        int number = 2;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(I_ASCII + I_ASCII, result);
    }

    @Test
    public void print3ShouldReturnAsciiIII() {
        // Arrange
        int number = 3;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(I_ASCII + I_ASCII + I_ASCII, result);
    }

    @Test
    public void print4ShouldReturnAsciiIV() {
        // Arrange
        int number = 4;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(I_ASCII + V_ASCII, result);
    }

    @Test
    public void print5ShouldReturnAsciiV() {
        // Arrange
        int number = 5;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(V_ASCII, result);
    }

    @Test
    public void print6ShouldReturnAsciiVI() {
        // Arrange
        int number = 6;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(V_ASCII + I_ASCII, result);
    }

    @Test
    public void print7ShouldReturnAsciiVII() {
        // Arrange
        int number = 7;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(V_ASCII + I_ASCII + I_ASCII, result);
    }

    @Test
    public void print8ShouldReturnAsciiVIII() {
        // Arrange
        int number = 8;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(V_ASCII + I_ASCII + I_ASCII + I_ASCII, result);
    }

    @Test
    public void print9ShouldReturnAsciiIX() {
        // Arrange
        int number = 9;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(I_ASCII + X_ASCII, result);
    }

    @Test
    public void print10ShouldReturnAsciiX() {
        // Arrange
        int number = 10;
        // Act
        String result = RomanPrinter.print(number);
        // Assert
        assertEquals(X_ASCII, result);
    }
}