package task6;

import task5.Task5;

public class Task6 {

    public static void main(String[] args) {
        int[] arr = new int[21];
        for(int i = 0; i < 100;i++){
            int randomNumber = Task5.randomInRange(0,20);
            arr[randomNumber]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number " + i + ": " + arr[i] + " times");
        }
    }

}
