public class Commissions{
    public static void main(String [] args){

        displayCommissionRate();
    }
    public static void displayCommissionRate(){
            System.out.print("Sales Amount\t\tCommision" + "\n______________________________");
        for(int i = 10000; i <= 100000; i+=5000){


            System.out.printf("\n\t%d\t\t\t%.2f",i,computeCommision(i));
        }
    }
    public static double computeCommision(double salesAmount){

        double commision = 0;

        if(salesAmount >= 0.01 && salesAmount <= 5000){
            commision += salesAmount * 0.08;
        }
        else if(salesAmount >= 5000.01 && salesAmount <= 10000){
            commision += salesAmount * 0.09;
        }
        else{
            commision += salesAmount * 0.10;
        }
        return commision;
    }
}
