package task1;

public class Task1 {

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String s1 = "Hello World";

        s1 = reverseString(s1);

        System.out.println(s1);
    }

}
