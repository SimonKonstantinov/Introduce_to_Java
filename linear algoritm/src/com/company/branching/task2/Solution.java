package com.company.branching.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        float a;
        float b;
        float c;
        float d;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            a = Float.parseFloat(reader.readLine());
            b = Float.parseFloat(reader.readLine());
            c = Float.parseFloat(reader.readLine());
            d = Float.parseFloat(reader.readLine());

            System.out.println(max(min(a, b), min(c, d)));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static float min(float a, float b) {
        return Math.min(a, b);
    }

    static float max(float a, float b) {
        return Math.max(a, b);

    }

}
