package com.company;

import java.util.Scanner;

public class Main {

    private static int x;
    private static int y;

    private static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter X: ");
        x = Integer.parseInt(scan.nextLine());
        System.out.print("Please, enter Y: ");
        y = Integer.parseInt(scan.nextLine());
    }

    private static int sum(int x, int y){
        return x + y;
    }

    private static double sin(int x){
        return Math.sin(x);
    }

    private static double solution(){
        double dividend = 1 + Math.pow(sin(sum(x, y)), 2);
        double divider = 2 + Math.abs(x - ((2 * x) / (1 + Math.pow((x * y), 2))));
        return (dividend / divider) + x;
    }

    public static void main(String[] args) {
	    input();
        System.out.println("Solution of this equation with X = " + x + " and Y = " + y + " is: " + solution());
    }
}
