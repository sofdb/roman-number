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
    
    @Test
    public void convert4ShouldReturnIV() {
        // Arrange
        int number = 4;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void convert5ShouldReturnV() {
        // Arrange
        int number = 5;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("V", result);
    }

    @Test
    public void convert6ShouldReturnVI() {
        // Arrange
        int number = 6;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("VI", result);
    }

    @Test
    public void convert7ShouldReturnVII() {
        // Arrange
        int number = 7;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("VII", result);
    }

    @Test
    public void convert8ShouldReturnVIII() {
        // Arrange
        int number = 8;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("VIII", result);
    }

    @Test
    public void convert9ShouldReturnIX() {
        // Arrange
        int number = 9;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("IX", result);
    }

    @Test
    public void convert10ShouldReturnX() {
        // Arrange
        int number = 10;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("X", result);
    }
}