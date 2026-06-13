package com.test.entity;

public interface Study {
    default void Study() {
        System.out.println("I am studying");
    }
    private void inner() {
        System.out.println("inner");
    }
}
