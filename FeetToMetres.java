public class FeetToMetres{
    public static void main(String [] args){

        displayResult();
    }
    public static void displayResult(){
        double metres = 20;

        System.out.print("Feet\t\tMetres\t\t|\t\tMetres\t\t\tFeet");
        System.out.print("\n_________________________________________________________");

        for(double foot = 1.0; foot <= 10; foot++){
            System.out.printf("\n%.0f\t\t\t%.3f\t\t|\t\t%.1f\t\t\t%.3f",foot,footToMetres(foot),metres,metresToFoot(metres));

            metres+=5;
        }
    }
    public static double footToMetres(double foot){
        return 0.305 * foot;
    }
    public static double metresToFoot(double metres){
        return 3.279 * metres;
    }
}
