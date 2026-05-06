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
        
        // Nuova logica per 4, 5 e 6
        while(number >= 5) {
            result += "V";
            number -= 5;
        }
        while(number >= 4) {
            result += "IV";
            number -= 4;
        }
        while(number >= 1) {
            result += "I";
            number -= 1;
        }
        
        return result;
    }
}