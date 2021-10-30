package com.company;

public class Main {

    private static boolean isPrime(int num){
        int temp;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    private static void solution(int[] array){
        System.out.println("Positions of prime numbers in array are: ");
        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        solution(array);
    }
}
