package com.company.com.company.branching.task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        int a;
        int b;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            a = Integer.parseInt((reader.readLine()));
            b = Integer.parseInt((reader.readLine()));

            System.out.println("треугольник сущесвует "+existsTriangle(a,b));
            System.out.println("треугольник прямоугольный "+rightTriangle(a,b));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static boolean existsTriangle(int a, int b) {
        return (a+b)<180 && a>0 && b>0;
    }
    static boolean rightTriangle(int a, int b) {
        return (a+b)==90;
    }

}