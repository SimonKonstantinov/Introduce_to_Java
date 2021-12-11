package com.company.branching.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        float x;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Float.parseFloat(reader.readLine());

            System.out.println(equation(x));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static double equation(float x) {
        if(x<=3){
            return Math.pow(x,2)-3*x+9;

        }
        else return 1/(Math.pow(x,3)+6);

    }



}
