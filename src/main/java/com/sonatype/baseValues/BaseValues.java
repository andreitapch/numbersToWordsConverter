package com.sonatype.baseValues;

import java.util.Map;

import static com.sonatype.baseValues.BaseValueBuilder.baseValueBuilder;

public class BaseValues implements IBaseValues {
    @Override
    public Map<Integer, String> oneDigitNumber() {
        return baseValueBuilder()
                .put(0, "zero")
                .put(1, "one")
                .put(2, "two")
                .put(3, "three")
                .put(4, "four")
                .put(5, "five")
                .put(6, "six")
                .put(7, "seven")
                .put(8, "eight")
                .put(9, "nine")
                .build();
    }

    @Override
    public Map<Integer, String> twoDigitNumber() {
        return baseValueBuilder()
                .put(10, "ten")
                .put(11, "eleven")
                .put(12, "twelve")
                .put(13, "thirteen")
                .put(14, "fourteen")
                .put(15, "fifteen")
                .put(16, "sixteen")
                .put(17, "seventeen")
                .put(18, "eighteen")
                .put(19, "nineteen")
                .build();
    }

    @Override
    public Map<Integer, String> tensNumber() {
        return baseValueBuilder()
                .put(20, "twenty")
                .put(30, "thirty")
                .put(40, "forty")
                .put(50, "fifty")
                .put(60, "sixty")
                .put(70, "seventy")
                .put(80, "eighty")
                .put(90, "ninety")
                .build();
    }
}

