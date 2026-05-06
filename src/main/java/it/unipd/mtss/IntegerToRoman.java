////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Valore fuori range");
        }
        String result = "";
        while(number >= 1) {
            result += "I";
            number -= 1;
        }
        return result;
    }
}
