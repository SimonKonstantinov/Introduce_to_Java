package com.company.LinearAlgoritmes.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        int x;


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Integer.parseInt(reader.readLine());
            System.out.println(equation(x));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String equation(int x) {
        int hours = x / 3600;
        int minute = (x % 3600) / 60;
        int seconds = (x % 3600) % 60;

        return String.format("%02dч:%02dмин:%02dс", hours, minute, seconds);
    }
}
