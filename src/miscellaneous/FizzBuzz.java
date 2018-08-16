package miscellaneous;

public class FizzBuzz {

    int fizzNumber;
    int buzzNumber;

    FizzBuzz(int fizzNumber, int buzzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
    }

    void play() {

        for(int number=1; number <= 100; number++) {

            if(number % fizzNumber == 0 && number % buzzNumber == 0)
                System.out.println("FizzBuzz");

            else if (number % 3 == 0)
                System.out.println("Fizz");

            else if (number % 5 == 0)
                System.out.println("Buzz");

            else
                System.out.println(number);
        }
    }
}
