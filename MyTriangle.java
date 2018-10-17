import java.util.Scanner;

public class MyTriangle {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){
            try {
                System.out.print("\nPlease enter the length of three sides of a triangle: "); //Get input from user
                double side1 = input.nextDouble();//Side1
                double side2 = input.nextDouble();//Side2
                double side3 = input.nextDouble();//Side3

                if(isValid(side1,side2,side3)){ //Triangle is valid is true
                    System.out.printf("%n The area of the triangle is: %.2f", calcArea(side1,side2,side3)); //Display area of triangle
                    break;
                }//End If
                else{//Else
                    System.out.println("\nPlease enter in lengths for a a valid triangle. E.g. ");//Error message
                }//End Else

            }
            catch(Exception e){//Catch
                System.out.println("\n Please enter a valid number for each side of the triangle: ");//Error Message
                input.next();
            }
        }




    }

    /**
     * Check if triangle is valid
     * Triangle is valid if the sum of the first two sides is greate than the third
     * @param side1
     * @param side2
     * @param side3
     * @return boolean
     */
    public static boolean isValid(double side1, double side2, double side3){

        boolean isValid = false;

        if((side1 + side2) > side3){
            isValid = true;
        }

        return isValid;
    }

    /**
     * Computes the area of the triangle
     * @param side1
     * @param side2
     * @param side3
     * @return double
     */
    public static double calcArea(double side1, double side2, double side3){

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}
