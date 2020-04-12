package com.adaptavist.tm4j.examples.cucumber.calculator;

import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Long> input = new ArrayList<>();

    private Long displayResult = 0L;

    public void input(long numberInput) {
        input.add(numberInput);
    }

    public void multiply() {
        this.displayResult = input.stream().reduce(1L, (a, b) -> a * b);
        input.clear();
    }

    public long getDisplayResult() {
        return this.displayResult;
    }
}
