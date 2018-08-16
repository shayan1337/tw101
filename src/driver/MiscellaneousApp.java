package driver;

import miscellaneous.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiscellaneousApp {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FizzBuzz fizzBuzz;
        PrimeFactors primeFactors;

        while (true) {

            System.out.println("OBJECTIVES: ");
            System.out.println("1. Play fizzbuzz");
            System.out.println("2. Print prime factors ");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(br.readLine());

            switch(choice) {

                case 1:
                    fizzBuzz = new FizzBuzz(3,5);
                    fizzBuzz.play();
                    break;

                case 2:
                    primeFactors = new PrimeFactors();
                    System.out.println(primeFactors.generate(30));
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("No such option. Enter a new number");
                    break;
            }
            System.out.println();
        }
    }
}
