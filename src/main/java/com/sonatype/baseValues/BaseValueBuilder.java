package com.sonatype.baseValues;


import java.util.HashMap;
import java.util.Map;

public class BaseValueBuilder {

    private final Map<Integer, String> result = new HashMap<>();

    public static BaseValueBuilder baseValueBuilder() {
        return new BaseValueBuilder();
    }

    public BaseValueBuilder put(Integer number, String value) {
        result.put(number, value);
        return this;
    }

    public Map<Integer, String> build() {
        return result;
    }
}
