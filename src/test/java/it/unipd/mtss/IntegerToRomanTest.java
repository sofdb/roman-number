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

    @Test
    public void convert11ShouldReturnXI() {
        int number = 11;
        String result = IntegerToRoman.convert(number);
        assertEquals("XI", result);
    }

    @Test
    public void convert12ShouldReturnXII() {
        int number = 12;
        String result = IntegerToRoman.convert(number);
        assertEquals("XII", result);
    }

    @Test
    public void convert13ShouldReturnXIII() {
        int number = 13;
        String result = IntegerToRoman.convert(number);
        assertEquals("XIII", result);
    }

    @Test
    public void convert14ShouldReturnXIV() {
        int number = 14;
        String result = IntegerToRoman.convert(number);
        assertEquals("XIV", result);
    }

    @Test
    public void convert15ShouldReturnXV() {
        int number = 15;
        String result = IntegerToRoman.convert(number);
        assertEquals("XV", result);
    }

    @Test
    public void convert16ShouldReturnXVI() {
        int number = 16;
        String result = IntegerToRoman.convert(number);
        assertEquals("XVI", result);
    }

    @Test
    public void convert17ShouldReturnXVII() {
        int number = 17;
        String result = IntegerToRoman.convert(number);
        assertEquals("XVII", result);
    }

    @Test
    public void convert18ShouldReturnXVIII() {
        int number = 18;
        String result = IntegerToRoman.convert(number);
        assertEquals("XVIII", result);
    }

    @Test
    public void convert19ShouldReturnXIX() {
        int number = 19;
        String result = IntegerToRoman.convert(number);
        assertEquals("XIX", result);
    }

    @Test
    public void convert20ShouldReturnXX() {
        int number = 20;
        String result = IntegerToRoman.convert(number);
        assertEquals("XX", result);
    }
    
    @Test
    public void convert40ShouldReturnXL() {
        int number = 40;
        String result = IntegerToRoman.convert(number);
        assertEquals("XL", result);
    }

    @Test
    public void convert44ShouldReturnXLIV() {
        int number = 44;
        String result = IntegerToRoman.convert(number);
        assertEquals("XLIV", result);
    }

    @Test
    public void convert49ShouldReturnXLIX() {
        int number = 49;
        String result = IntegerToRoman.convert(number);
        assertEquals("XLIX", result);
    }

    @Test
    public void convert50ShouldReturnL() {
        int number = 50;
        String result = IntegerToRoman.convert(number);
        assertEquals("L", result);
    }
}