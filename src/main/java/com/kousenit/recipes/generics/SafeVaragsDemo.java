package com.kousenit.recipes.generics;

import java.time.LocalDate;

public class SafeVaragsDemo {

    public String[] replaceFirstStringWithDate(LocalDate date, String... strings) {
        strings[0] = date.toString();
        return strings;
    }

    @SafeVarargs  // can only be applied to final methods
    public final <T> T[] replaceFirstValueInArray(T value, T... array) {
        // Compiles because of type erasure
        // But "possible heap pollution from parameterized vararg type"
        array[0] = value;
        return array;
    }
}
