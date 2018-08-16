package miscellaneous;

import java.util.ArrayList;

class PrimeFactors{

    private static boolean isPrime(int number){

        for(int i=2;i<=Math.sqrt(number);i++){

            if(number % i == 0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer> generate(int number){

        ArrayList<Integer> primeFactors = new ArrayList<>();

        for(int i=2; i <= number; i++){

            if(number % i == 0 && isPrime(i))
                primeFactors.add(i);
        }
        return primeFactors;
    }
}