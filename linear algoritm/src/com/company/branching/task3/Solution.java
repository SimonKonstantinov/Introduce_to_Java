package com.company.branching.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        float x1, y1, x2, y2, x3, y3;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x1 = Float.parseFloat(reader.readLine());
            y1 = Float.parseFloat(reader.readLine());
            x2 = Float.parseFloat(reader.readLine());
            y2 = Float.parseFloat(reader.readLine());
            x3 = Float.parseFloat(reader.readLine());
            y3 = Float.parseFloat(reader.readLine());
            System.out.println(collinear(x1,y1,x2,y2,x3,y3));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static boolean collinear(float x1, float y1, float x2, float y2, float x3, float y3) {
        return (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2);
    }



}
