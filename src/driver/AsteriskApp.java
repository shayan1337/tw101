package driver;

import asterisk.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsteriskApp {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Asterisk asterisk;
        HorizontalAsteriskLine horizontalAsteriskLine;
        VerticalAsteriskLine verticalAsteriskLine;

        while (true) {

            System.out.println("OBJECTIVES: ");
            System.out.println("1. Print a single asterisk");
            System.out.println("2. Print a horizontal asterisk line");
            System.out.println("3. Print a vertical asterisk line");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(br.readLine());

            switch(choice) {

                case 1:
                    asterisk = new Asterisk();
                    asterisk.print();
                    break;

                case 2:
                    horizontalAsteriskLine = new HorizontalAsteriskLine(8);
                    horizontalAsteriskLine.draw();
                    break;

                case 3:
                    verticalAsteriskLine = new VerticalAsteriskLine(8);
                    verticalAsteriskLine.draw();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("No such option. Enter a new number");
                    break;
            }
            System.out.println();
        }
    }
}
