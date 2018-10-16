import java.util.Scanner;

public class MyTriangle {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){
            try {
                System.out.print("\nPlease enter the length of three sides of a triangle: ");
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();

                if(isValid(side1,side2,side3)){
                    System.out.printf("%n The area of the triangle is: %.2f", calcArea(side1,side2,side3));
                }
                else{
                    System.out.println("\nPlease enter in lengths for a a valid triangle. E.g. ")
                }

            }
            catch(Exception e){
                System.out.println("\n Please enter a valid number for each side of the triangle: ");
                input.next();
            }
        }



    }
    public static boolean isValid(double side1, double side2, double, double side3){

    }
    public static double calcArea(double side1, double side2, double side3){

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}
