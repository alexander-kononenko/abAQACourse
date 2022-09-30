package org.AK.game1;

public class AgeChecker {
    private final int MIN_AGE = 21;

    public boolean CanPlayGameAge (int age) {
        return age >= MIN_AGE;
    }
}
