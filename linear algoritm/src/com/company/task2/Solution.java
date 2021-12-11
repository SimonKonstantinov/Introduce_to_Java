package com.company.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        float a;
        float b;
        float c;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            a = Float.parseFloat(reader.readLine());
            b = Float.parseFloat(reader.readLine());
            c = Float.parseFloat(reader.readLine());
            System.out.println(equation(a, b, c));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    static float equation(float a, float b, float c) {
        return (float) ((b + Math.sqrt(Math.pow(b, 2) + a * c)) / (2 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2));
    }

}