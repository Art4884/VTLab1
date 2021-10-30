package com.company;

import java.util.Scanner;

public class Main {

    private static double x;
    private static double y;

    private static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter X: ");
        x = Integer.parseInt(scan.nextLine());
        System.out.print("Please, enter Y: ");
        y = Integer.parseInt(scan.nextLine());
    }

    private static boolean yCheck(){
        if(y > 0){
            if(y < 5){
                return xCheck(1);
            }
        }else{
            if(y > -3){
                return xCheck(-1);
            }
        }
        return false;
    }

    private static boolean xCheck(int yStatus){
        if(yStatus > 0){
            if(x < 4 && x > -4){
                return true;
            }
        }else{
            if(x < 6 && x > -6){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
	    input();
        System.out.println(yCheck());
    }
}
