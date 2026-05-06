////////////////////////////////////////////////////////////////////
// SOFIA DE BLASI 2111014
// GIOVANNI VISENTIN 2101064
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {

    private static final Map<Character, String> ASCII = new HashMap<>();
    
    static {
        ASCII.put('I', " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n");
        ASCII.put('V', " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n");
        ASCII.put('X', " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n");
        ASCII.put('L', " __      \n| |      \n| |      \n| |      \n| |____  \n|______| \n");
        ASCII.put('C', "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n");
        ASCII.put('D', " _____   \n|  __ \\  \n| |  | | \n| |  | | \n| |__| | \n|_____/  \n");
    }

    public static String print(int number) {
        String roman = IntegerToRoman.convert(number);
        return printAsciiArt(roman);
    }

    private static String printAsciiArt(String roman) {
        StringBuilder result = new StringBuilder();
        for(char c : roman.toCharArray()) {
            if(!ASCII.containsKey(c)) {
                throw new IllegalArgumentException("ASCII art non definita");
            }
            result.append(ASCII.get(c));
        }
        return result.toString();
    }
}