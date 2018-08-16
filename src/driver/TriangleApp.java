package driver;

import triangle.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IsoscelesTriangle isoscelesTriangle;
        RightTriangle rightTriangle;

        while (true) {

            System.out.println("OBJECTIVES: ");
            System.out.println("1. Print an isosceles triangle");
            System.out.println("2. Print a right triangle ");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(br.readLine());

            switch(choice) {

                case 1:
                    isoscelesTriangle = new IsoscelesTriangle(8,'*');
                    isoscelesTriangle.draw();
                    break;

                case 2:
                    rightTriangle = new RightTriangle(8,'*');
                    rightTriangle.draw();
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
