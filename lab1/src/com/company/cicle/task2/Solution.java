package com.company.cicle.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        float a;
        float b;
        float h;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            a = Float.parseFloat(reader.readLine());
            b = Float.parseFloat(reader.readLine());
            h = Float.parseFloat(reader.readLine());
            equation(a, b, h);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void equation(float a, float b, float h) {

        for (float x = a; x <= b; x += h) {
            if (a > 2)
                System.out.print(a + " ");
            else System.out.print(-a + " ");
            if (h == 0) return;
            if (x <= a) return;

        }
    }


}
