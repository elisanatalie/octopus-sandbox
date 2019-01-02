package org.kata;

public class Square {
    public static boolean isSquare(int n) {
        final int sqrt = (int) Math.floor(Math.sqrt(n));
        return (sqrt * sqrt) == n;
    }
}