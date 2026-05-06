////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if(number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Valore fuori range");
        }
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                result.append(symbols[i]);
            }
        }
        
        return result.toString();
    }
}