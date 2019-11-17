package com.company;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Calculator calculator = new Calculator();
        System.out.println("Выберете язык:");
        File dir = new File("C://Users//Anastasia//Projects//Multilingual_calculator//languages");
        String[] arrFiles = dir.list();
        for (String fileName : arrFiles) {
            System.out.println(fileName);
        }
        Scanner scan = new Scanner(System.in);
        Map<String, String> translation = TranslationHelper.getTranslation("C://Users//Anastasia//Projects//Multilingual_calculator//languages//" + scan.nextLine());
        System.out.println(translation.get("greeting"));

        while (true) {
            System.out.println(translation.get("enter"));
            String expression = scan.nextLine();
            System.out.println(expression+"="+Calculator.calculator(expression));

        }
    }
}