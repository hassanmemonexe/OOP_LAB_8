package task4;

public class Task4 {

    public static void main(String[] args) {
        countVowelsAndConsonants("Hello, World!");
    }

    public static void countVowelsAndConsonants(String str){

        str = str.toUpperCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90){
                    if (    str.charAt(i) == 'A' ||
                            str.charAt(i) == 'E' ||
                            str.charAt(i) == 'I' ||
                            str.charAt(i) == 'O' ||
                            str.charAt(i) == 'U'  )
                    {
                        vowels++;
                    }
                    else{
                     consonants++;
                    }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
