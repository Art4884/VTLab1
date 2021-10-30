package com.company;

public class Main {

    private static void solution(int[] a, int[] b){
        int[] solution = new int[a.length + b.length];
        System.out.print("Places for integrity: ");
        int j = 0, k = 0;
        for(int i = 0; i < solution.length; i++){
           if(a[j] <= b[k]){
               solution[i] = a[j];
               if(j != a.length - 1){
                   j++;
               }else{
                   i++;
                   for(int l = k; l < b.length; l++){
                       System.out.println(i+1 + " ");
                       solution[i] = b[l];
                       i++;
                   }
               }
           }else{
               solution[i] = b[k];
               System.out.print(i+1 + " ");
               if(k != b.length - 1){
                   k++;
               }else{
                   i++;
                   for(int l = j; l < a.length; l++){
                       solution[i] = a[l];
                       i++;
                   }
               }
           }
        }
    }

    public static void main(String[] args) {
	    int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        solution(a, b);
    }
}
