package com.company;

public class Main {

    public static int subsequenceCountFromFirst(int[] sequence) {
        int border = sequence.length;
        int first = sequence[0];
        int count = 1;
        for(int i = 1; i < border; i++){
            if(first < sequence[i]){
                first = sequence[i];
                count++;
            }
        }
        return count;
    }

    public static int smallestFounder(int[] array){
        int border = array.length;
        int smallestPosition = 0;
        int smallest = array[0];
        for(int i = 1; i < border; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestPosition = i;
            }
        }
        return smallestPosition;
    }

    public static int subsequenceCountFromSmallest(int[] sequence){
        int smallestPosition = smallestFounder(sequence);
        int smallest = sequence[smallestPosition];
        int count = 1;
        int border = sequence.length;
        int forI = smallestPosition + 1;
        for(int i = forI; i < border; i++){
            if(smallest < sequence[i]){
                smallest = sequence[i];
                count++;
            }
        }
        return count;
    }

    public static int[] subsequenceForm(int[] sequence) {
        int border = sequence.length;
        int countFromFirst = subsequenceCountFromFirst(sequence);
        int countFromSmallest = subsequenceCountFromSmallest(sequence);
        int[] subsequence;
        if(countFromFirst > countFromSmallest){
            subsequence = new int[countFromFirst];
            subsequence[0] = sequence[0];
            int temp = sequence[0];
            int j = 1;
            for(int i = 1; i < border; i++){
                if(temp < sequence[i]){
                    temp = sequence[i];
                    subsequence[j] = sequence[i];
                    j++;
                }
            }
        }else{
            subsequence = new int[countFromSmallest];
            int smallestPosition = smallestFounder(sequence);
            int j = 1;
            subsequence[0] = sequence[smallestPosition];
            int temp = sequence[smallestPosition];
            int forI = smallestPosition + 1;
            for(int i = forI; i < border; i++){
                if(sequence[i] > temp){
                    temp = sequence[i];
                    subsequence[j] = sequence[i];
                    j++;
                }
            }
        }
        return subsequence;
    }

    public static void main(String[] args) {
	    int[] sequence = {0, -1, 2, -2, 5, 6, -7};
        int[] subsequence = subsequenceForm(sequence);
        System.out.println("The smallest K is: " + (sequence.length - subsequence.length));
    }
}
