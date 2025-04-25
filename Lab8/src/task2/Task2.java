package task2;
import task1.Task1;

public class Task2 {
    public static boolean isPalindrome(String s){

        return s.equalsIgnoreCase(Task1.reverseString(s));
    }

    public static void main(String[] args) {

        String s1 = "RaceCar";
        String s2 = "Drive";

        System.out.println(s1 + " is Palindrome: " + isPalindrome(s1));
        System.out.println(s2 + " is Palindrome: " + isPalindrome(s2));
    }
}
