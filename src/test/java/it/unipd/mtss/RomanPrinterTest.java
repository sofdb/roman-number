////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    private static final String I_ASCII = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";

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
}