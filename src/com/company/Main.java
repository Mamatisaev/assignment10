package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(contains(scan.nextInt(), 1, 2, 3, 4, 5, 6, 7, 9, 10));
    }
    public static boolean contains(int a, int... b) {
        for (int i = 0; i < b.length; i++) {
            if (a == b [i]) {
                return true;
            }
        }
        return false;
    }
}