package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = 0;
        while(radius <= 0) {
            System.out.println("Enter a radius: ");
            try {
                radius = input.nextDouble();
                System.out.println(("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius)));
            }catch (InputMismatchException e){
                System.out.println("invalid input, you must input a number greater than 0.");
                break;
            }catch (Exception e){
                System.out.println("An error occurred");
                break;
            }
        }

    }
}
