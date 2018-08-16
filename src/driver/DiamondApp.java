package driver;

import diamond.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DiamondApp {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Diamond diamond;
        DiamondWithName diamondWithName;

        while (true) {

            System.out.println("OBJECTIVES: ");
            System.out.println("1. Print a diamond");
            System.out.println("2. Print a diamond with name ");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(br.readLine());

            switch(choice) {

                case 1:
                    diamond = new Diamond(8,'*');
                    diamond.draw();
                    break;

                case 2:
                    diamondWithName = new DiamondWithName(8,'*', "Sayan");
                    diamondWithName.draw();
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
