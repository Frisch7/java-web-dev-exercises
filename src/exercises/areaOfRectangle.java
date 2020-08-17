package exercises;
import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter Width of Rectangle: ");
        double width = input.nextDouble();

        System.out.println("Area of rectangle is " + areaOfRectangle(length, width));
    }
    public static double areaOfRectangle(double length, double width){
        return length*width;
    }
}
