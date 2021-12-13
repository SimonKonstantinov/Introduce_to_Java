package com.company.cicle.task4;


import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        System.out.println(equation());
    }

    private static BigInteger equation() {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        return s;
    }
}