package com.company.com.company.cicle.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        int x;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            x = Integer.parseInt(reader.readLine());
            if (x > 0) {
                System.out.println(equation(x));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static int equation(int x) {
        int sum =0;
        for(int i=0;i<=x;i++)
        {
            sum+=i;
        }
return sum;
    }


}
