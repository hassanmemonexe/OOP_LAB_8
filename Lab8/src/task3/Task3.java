package task3;

public class Task3 {


    public static void main(String[] args) {

        System.out.println("aaa = " + longestUniqueSubstring("aaa"));
        System.out.println("apple = " + longestUniqueSubstring("apple"));
        System.out.println("racer = " + longestUniqueSubstring("racer"));
        System.out.println("palindrome = " + longestUniqueSubstring("palindrome"));

    }

    public static int longestUniqueSubstring(String s){

        String longestSubString = "";
        String currentSubString = "";

        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = start; j < s.length(); j++) {
                if (currentSubString.indexOf(s.charAt(j)) == -1) {
                    currentSubString += s.charAt(j);
                }
                else {
                    start += currentSubString.indexOf(s.charAt(j)) + 1;
                    break;
                }
            }

            if (longestSubString.length() < currentSubString.length()){
                longestSubString = currentSubString;
            }
            currentSubString = "";

        }

        return longestSubString.length();
    }
}
