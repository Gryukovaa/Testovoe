package jm;

import java.time.LocalDate;

public class Calculator {

    public static String div(String x, String y)
    {
        String div = "";
        if(checkRomeNumbers(x) && checkRomeNumbers(y)) {
            try {
                div = Convert.arabToRome(Convert.romeToArab(x) / Convert.romeToArab(y));

            } catch (ConvertExceptions ex){
                System.out.println(ex.toString());

            }
        } else if(!checkRomeNumbers(x) && !checkRomeNumbers(y)) {
            div = String.valueOf(Integer.parseInt(x) / Integer.parseInt(y));
        } else {
            throw new IllegalArgumentException("Только арабские или только римские числа.");
        }
        return div;
    }

    public static String minus(String x, String y) {
        String minus = "";
        if(checkRomeNumbers(x) && checkRomeNumbers(y)) {
            try {
                minus = Convert.arabToRome(Convert.romeToArab(x) - Convert.romeToArab(y));

            } catch (ConvertExceptions ex){
                System.out.println(ex.toString());
            }
        } else if(!checkRomeNumbers(x) && !checkRomeNumbers(y)) {
            minus = String.valueOf(Integer.parseInt(x) - Integer.parseInt(y));
        } else {
            throw new IllegalArgumentException("Только арабские или только римские числа.");
        }
        return minus;
    }

    public static String plus(String x, String y) {
        String plus = "";
        if(checkRomeNumbers(x) && checkRomeNumbers(y)) {
            try {
                plus = Convert.arabToRome(Convert.romeToArab(x) + Convert.romeToArab(y));

            } catch (ConvertExceptions ex){
                System.out.println(ex.toString());
            }
        } else if(!checkRomeNumbers(x) && !checkRomeNumbers(y)) {
            plus = String.valueOf(Integer.parseInt(x) + Integer.parseInt(y));
        } else {
            throw new IllegalArgumentException("Только арабские или только римские числа.");
        }
        return plus;
    }

    public static String mult(String x, String y) {
        String mult = "";
        if(checkRomeNumbers(x) && checkRomeNumbers(y)) {
            try {
                mult = Convert.arabToRome(Convert.romeToArab(x) * Convert.romeToArab(y));

            } catch (ConvertExceptions ex){
                System.out.println(ex.toString());
            }
        } else if(!checkRomeNumbers(x) && !checkRomeNumbers(y)) {
            mult = String.valueOf(Integer.parseInt(x) * Integer.parseInt(y)); }
        else {
            throw new IllegalArgumentException("Только арабские или только римские числа.");
        }
        return mult;
    }

    public static boolean checkRomeNumbers(String x) {
        return "IIIVIIIX".contains(x);
        }
    }

