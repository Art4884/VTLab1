package com.company;

import java.util.Scanner;

public class Main {

    private static double a;
    private static double b;
    private static double h;

    private static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter A: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print("Please, enter B: ");
        b = Integer.parseInt(scan.nextLine());
        System.out.print("Please, enter H: ");
        h = Integer.parseInt(scan.nextLine());
    }

    private static void solution(){
        do{
            double solution = Math.tan(a);
            System.out.println("F(" + a + ") = " + solution);
            a += h;
        }while(a <= b);
    }

    public static void main(String[] args) {
	input();
    solution();
    }
}
