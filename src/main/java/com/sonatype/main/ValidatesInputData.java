package com.sonatype.main;

import com.sonatype.converter.UnitsConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ValidatesInputData {

    private UnitsConverter unitsConverter = new UnitsConverter();

    private int readInputData() throws IOException {
        int inputNumber = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* Please type a valid number to convert from numbers to Words *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        String input = reader.readLine();
        try {
            if (input.isEmpty()) {
                System.out.println("*-* Please type a valid number to convert from numbers to Words *-*");
                input = reader.readLine();
            }
            inputNumber = Integer.parseInt(input);

        } catch (NumberFormatException ex) {
            System.out.println("The input is not a valid number");
            System.exit(1);
        }
        return inputNumber;
    }

    public String validatesDataRange() throws IOException {
        int smallest = Integer.MIN_VALUE;
        int largest = Integer.MAX_VALUE;
        int inputNumber = readInputData();
        System.out.println("The typed number was: " + inputNumber);
        String numbers2Words = "";
        if (inputNumber >= 0 && inputNumber <= largest) {
            numbers2Words = unitsConverter.getStringNumbers(inputNumber);
            System.out.println("The number is: " + numbers2Words);
        } else if (inputNumber < 0 && inputNumber >= smallest) {
            int inputNegative = inputNumber * -1;
            numbers2Words = unitsConverter.getStringNumbers(inputNegative);
            System.out.println("The number is: minus " + numbers2Words);
        }
        return numbers2Words;
    }
}

