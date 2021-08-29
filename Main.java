package jm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        String operator = strings[1];
        switch (operator) {
            case "-" -> System.out.println(Calculator.minus(strings[0], strings[2]));
            case "+" -> System.out.println(Calculator.plus(strings[0], strings[2]));
            case "*" -> System.out.println(Calculator.mult(strings[0], strings[2]));
            case "/" -> System.out.println(Calculator.div(strings[0], strings[2]));
        }


    }
}
