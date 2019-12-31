package com.sonatype.converter;

import com.sonatype.baseValues.BaseValues;

import java.util.Map;


public class UnitsConverter {

    private static final String HUNDRED = "hundred";
    private static final String THOUSAND = "thousand ";
    private static final String MILLION = "million ";
    private static final String BILLION = "billion ";
    private static final String HUNDRED_THOUSAND = " hundred thousand ";
    private BaseValues baseValues = new BaseValues();
    private Map<Integer, String> tensNumber = baseValues.tensNumber();
    private Map<Integer, String> oneDigitNumber = baseValues.oneDigitNumber();
    private Map<Integer, String> twoDigitNumber = baseValues.twoDigitNumber();


    private String convertTensToWords(int inputValue) {
        String wordsInNumber;
        int reminder = inputValue % 10;
        if (reminder > 0) {
            int value = inputValue - reminder;
            wordsInNumber = getNumber(value, tensNumber) + " " + getNumber(reminder, oneDigitNumber);
        } else {
            wordsInNumber = getNumber(inputValue, tensNumber);
        }
        return wordsInNumber;
    }

    private String convertHundredThousandNumbersToWords(int inputValue) {
        int digit = Integer.parseInt(Integer.toString(inputValue).substring(0, 1));
        int reminder = inputValue % 100000;
        String notation = "";
        String firstDigits = getStringNumbers(digit);
        if (reminder > 0) {
            String lastDigits = getStringNumbers(reminder);
            if (Integer.parseInt(Integer.toString(inputValue).substring(1, 3)) == 0) {
                notation = THOUSAND;
            }
            return firstDigits + " " + HUNDRED + " " + notation + lastDigits;
        }
        return firstDigits + HUNDRED_THOUSAND;
    }

    private String convertHundredMillionsNumbersToWords(int inputValue) {
        int digit = Integer.parseInt(Integer.toString(inputValue).substring(0, 1));
        String firstDigits = getStringNumbers(digit);
        int reminder = inputValue % 100000000;
        if (reminder > 0) {
            String lastDigits = getStringNumbers(reminder);
            return firstDigits + " " + HUNDRED + " " + lastDigits;
        } else {
            return firstDigits + HUNDRED + " " + MILLION;
        }
    }

    private String convertNumbersToWords(int inputValue, int digitQty, int module, String units) {
        int digit = Integer.parseInt(Integer.toString(inputValue).substring(0, digitQty));
        String firstDigits = getStringNumbers(digit);
        int reminder = inputValue % module;
        if (reminder > 0) {
            String lastDigits = getStringNumbers(reminder);
            return firstDigits + units + lastDigits;
        } else {
            return firstDigits + units;
        }
    }
    // this method use some map input to find the right number the base map is on BaseValue class
    private String getNumber(int inputValue, Map<Integer, String> mapOfNumbers) {
        return mapOfNumbers.entrySet().stream()
                .filter(e -> e.getKey().equals(inputValue))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }
    // this method get the user input and convert it into words by their respective number size
    public String getStringNumbers(int inpuNumber) {
        String wordsInNumber;

        if (inpuNumber >= 0 & inpuNumber <= 9) {
            wordsInNumber = getNumber(inpuNumber, oneDigitNumber);

        } else if (inpuNumber >= 10 & inpuNumber <= 19) {
            wordsInNumber = getNumber(inpuNumber, twoDigitNumber);

        } else if (inpuNumber >= 20 & inpuNumber <= 99) {
            wordsInNumber = convertTensToWords(inpuNumber);

        } else if (inpuNumber >= 100 & inpuNumber <= 999) {
            wordsInNumber = convertNumbersToWords(inpuNumber, 1, 100, " " + HUNDRED + " ");

        } else if (inpuNumber >= 1_000 & inpuNumber <= 9_999) {
            wordsInNumber = convertNumbersToWords(inpuNumber, 1, 1000, " " + THOUSAND);

        } else if (inpuNumber >= 10_000 & inpuNumber <= 99_999) {
            wordsInNumber = convertNumbersToWords(inpuNumber, 2, 1000, " " + THOUSAND);

        } else if (inpuNumber >= 100_000 && inpuNumber <= 999_999) {
            wordsInNumber = convertHundredThousandNumbersToWords(inpuNumber);

        } else if (inpuNumber >= 1_000_000 && inpuNumber <= 9_999_999) {
            wordsInNumber = convertNumbersToWords(inpuNumber, 1, 1000000, " " + MILLION);

        } else if (inpuNumber >= 10_000_000 && inpuNumber <= 99_999_999) {
            wordsInNumber = convertNumbersToWords(inpuNumber, 2, 1000000, " " + MILLION);

        } else if (inpuNumber >= 100_000_000 && inpuNumber <= 999_999_999) {
            wordsInNumber = convertHundredMillionsNumbersToWords(inpuNumber);

        } else {
            wordsInNumber = convertNumbersToWords(inpuNumber, 1, 1000000000, " " + BILLION);
        }
        return wordsInNumber;
    }

}
