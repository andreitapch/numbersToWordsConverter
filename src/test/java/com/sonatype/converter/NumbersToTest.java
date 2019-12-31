package com.sonatype.converter;

import java.util.HashMap;
import java.util.Map;


public class NumbersToTest {
    private Map<Integer, String> numbersToTest = new HashMap<>();
    private Map<Integer, String> negativeNumbers = new HashMap<>();

    public Map<Integer, String> getIntToStringMap() {

        numbersToTest.put(0, "zero");
        numbersToTest.put(1, "one");
        numbersToTest.put(2, "two");
        numbersToTest.put(3, "three");
        numbersToTest.put(4, "four");
        numbersToTest.put(5, "five");
        numbersToTest.put(6, "six");
        numbersToTest.put(7, "seven");
        numbersToTest.put(8, "eight");
        numbersToTest.put(9, "nine");
        numbersToTest.put(10, "ten");
        numbersToTest.put(11, "eleven");
        numbersToTest.put(12, "twelve");
        numbersToTest.put(14, "fourteen");
        numbersToTest.put(17, "seventeen");
        numbersToTest.put(20, "twenty");
        numbersToTest.put(29, "twenty nine");
        numbersToTest.put(40, "forty");
        numbersToTest.put(90, "ninety");
        numbersToTest.put(89, "eighty nine");
        numbersToTest.put(100, "one hundred ");
        numbersToTest.put(101, "one hundred one");
        numbersToTest.put(111, "one hundred eleven");
        numbersToTest.put(120, "one hundred twenty");
        numbersToTest.put(125, "one hundred twenty five");
        numbersToTest.put(358, "three hundred fifty eight");
        numbersToTest.put(400, "four hundred ");
        numbersToTest.put(459, "four hundred fifty nine");
        numbersToTest.put(999, "nine hundred ninety nine");
        numbersToTest.put(1000, "one thousand ");
        numbersToTest.put(1009, "one thousand nine");
        numbersToTest.put(1019, "one thousand nineteen");
        numbersToTest.put(1089, "one thousand eighty nine");
        numbersToTest.put(2189, "two thousand one hundred eighty nine");
        numbersToTest.put(3999, "three thousand nine hundred ninety nine");
        numbersToTest.put(9999, "nine thousand nine hundred ninety nine");
        numbersToTest.put(10000, "ten thousand ");
        numbersToTest.put(10001, "ten thousand one");
        numbersToTest.put(13201, "thirteen thousand two hundred one");
        numbersToTest.put(93231, "ninety three thousand two hundred thirty one");
        numbersToTest.put(80200, "eighty thousand two hundred ");
        numbersToTest.put(800200, "eight hundred thousand two hundred ");
        numbersToTest.put(810200 , "eight hundred ten thousand two hundred ");
        numbersToTest.put(810201, "eight hundred ten thousand two hundred one");
        numbersToTest.put(4033201 , "four million thirty three thousand two hundred one");
        numbersToTest.put(1033200, "one million thirty three thousand two hundred ");
        numbersToTest.put(5003200 , "five million three thousand two hundred ");
        numbersToTest.put(15003200  , "fifteen million three thousand two hundred ");
        numbersToTest.put(85003201 , "eighty five million three thousand two hundred one");
        numbersToTest.put(185003200  , "one hundred eighty five million three thousand two hundred ");
        numbersToTest.put(1020724731  , "one billion twenty million seven hundred twenty four thousand seven hundred thirty one");

        return numbersToTest;
    }

    public Map<Integer, String> getNegativeToStringMap() {
        negativeNumbers.put(-1, "minus one");
        negativeNumbers.put(-3, "minus three");
        negativeNumbers.put(-2189, "minus two thousand one hundred eighty nine");
        negativeNumbers.put(-3999, "minus three thousand nine hundred ninety nine");
        negativeNumbers.put(-9999, "minus minus nine thousand nine hundred ninety nine");
        negativeNumbers.put(-10000, "minus ten thousand ");
        negativeNumbers.put(-10001, "minus ten thousand one");
        negativeNumbers.put(-13201, "minus thirteen thousand two hundred one");
        negativeNumbers.put(-93231, "minus ninety three thousand two hundred thirty one");
        negativeNumbers.put(-80200, "minus eighty thousand two hundred ");
        negativeNumbers.put(-800200, "minus eight hundred thousand two hundred ");
        negativeNumbers.put(-810200 , "minus eight hundred ten thousand two hundred ");
        negativeNumbers.put(-810201, "minus eight hundred ten thousand two hundred one");
        negativeNumbers.put(-4033201 , "minus four million thirty three thousand two hundred one");
        negativeNumbers.put(-1033200, "minus one million thirty three thousand two hundred ");
        negativeNumbers.put(-5003200 , "minus five million three thousand two hundred ");
        negativeNumbers.put(-15003200  , "minus fifteen million three thousand two hundred ");
        negativeNumbers.put(-85003201 , "minus eighty five million three thousand two hundred one");
        negativeNumbers.put(-185003200  , "minus one hundred eighty five million three thousand two hundred ");
        negativeNumbers.put(-1020724731  , "minus one billion twenty million seven hundred twenty four thousand seven hundred thirty one");

        return numbersToTest;
    }

}
