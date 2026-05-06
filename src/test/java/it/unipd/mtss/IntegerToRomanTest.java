////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert1ShouldReturnI() {
        // Arrange
        int number = 1;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert2ShouldReturnII() {
        // Arrange
        int number = 2;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("II", result);
    }

    @Test
    public void convert3ShouldReturnIII() {
        // Arrange
        int number = 3;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("III", result);
    }
}