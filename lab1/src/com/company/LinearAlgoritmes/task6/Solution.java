package com.company.LinearAlgoritmes.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        int x;
        int y;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
            System.out.println(belongsFigure(x, y));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean belongsFigure(int x, int y) {
        return ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4));

    }
}
