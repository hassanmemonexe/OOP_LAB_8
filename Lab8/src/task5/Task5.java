package task5;

public class Task5 {

    public static boolean isPrime(int num){
        int factors = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0) factors++;
            if(factors > 2) return false;
        }
        return (factors == 2);
    }
    public static int randomInRange(int min, int max){
        return (int)( Math.random() * (max - min + 1) ) + min;
    }
    public static int generateRandomPrime(int min, int max){
        if(min >= max) return -1;
        int randomNumber = randomInRange(min,max);
        while(!isPrime(randomNumber)){

            randomNumber = randomInRange(min, max);
        }
        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomPrime(10,20));
    }

}
