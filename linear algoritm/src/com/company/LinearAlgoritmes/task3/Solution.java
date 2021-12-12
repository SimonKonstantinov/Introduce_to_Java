package com.company.LinearAlgoritmes.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        double x;
        double y;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Double.parseDouble(reader.readLine());
            y = Double.parseDouble(reader.readLine());

            System.out.println(equation(x,y));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static double equation(double x, double y) {
        return ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))) * Math.tan(x*y);
    }

}