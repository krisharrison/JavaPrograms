
public class WeightConversions {
    public static void main(String [] args){

        displayTable();


    }
    public static void displayTable(){

        System.out.println("Kilograms        Pounds");


        for(int i = 1; i <= 199; i += 2){
            System.out.print(i);
            for(int j = 0; j < 1; j++){
                System.out.printf("%22.1f ", i * 2.2);
            }
            System.out.println();
        }
    }
}
