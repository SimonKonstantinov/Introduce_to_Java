package com.company.LinearAlgoritmes.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        double x;


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Double.parseDouble(reader.readLine());
            System.out.println(equation(x));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static String equation(double x) {
        DecimalFormat df = new DecimalFormat("#.###");
        String value = df.format(x);
        String[] words = value.split(",");
        return words[1] + "." + words[0];
    }

}