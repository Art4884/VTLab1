package com.company;

public class Main {

    public static void main(String[] args) {
	    double[] in = {1.7, 1, 3.6, 8, 6.7, 5.3};
        shellsSort(in);
        for(double dub : in){
            System.out.print(dub + " ");
        }
    }

    public static void shellsSort(double[] array){
        for(int i = 0; i < array.length - 1;){
            if(array[i] > array[i+1]){
                double tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
                if(i > 0){
                    i--;
                }
            }else{
                i++;
            }
        }
    }
}
