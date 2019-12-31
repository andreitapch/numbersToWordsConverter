package com.sonatype.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ValidatesInputData validatesInputData = new ValidatesInputData();
        validatesInputData.validatesDataRange();
    }
}
