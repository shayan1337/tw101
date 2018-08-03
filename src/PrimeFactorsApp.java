import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class PrimeFactorsApp{
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int number = Integer.parseInt(br.readLine());
        PrimeFactors obj = new PrimeFactors();
        ArrayList<Integer> primeFactors = obj.generate(number);

        if(primeFactors.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println(primeFactors);
    }
}