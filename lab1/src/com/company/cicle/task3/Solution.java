package com.company.cicle.task3;



public class Solution {

    public static void main(String[] args) {
        // write your code here


        System.out.println(equation());
    }

    private static int equation() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }
}