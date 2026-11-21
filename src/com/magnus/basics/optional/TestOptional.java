package com.magnus.basics.optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        String name = null;
        Optional<String> test = Optional.of("test");
        Optional<String> name1 = Optional.ofNullable(name);
        String v = test.orElse("ghjgjh");



    }
}
