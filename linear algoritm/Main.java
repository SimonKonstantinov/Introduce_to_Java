package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float a;
        float b;
        float c;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            a = Float.parseFloat(reader.readLine());
            b = Float.parseFloat(reader.readLine());
            c = Float.parseFloat(reader.readLine());
            System.out.println(equation(a,b,c));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static float equation(float a, float b, float c) {
        return ((a - 3) * b / 2) + c;
    }

}
