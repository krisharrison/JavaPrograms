import java.util.Scanner;

public class CelciusToFahrenheit{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String userInput;
        double userTemperature;

        while(true){
            try {
                System.out.print("What temperature would you like to convert? ");
                userInput = input.next();

                if(userInput.toUpperCase().equals("FAHRENHEIT")){
                        System.out.print("\n Please enter the temperature in Fahrenheit: ");
                        userTemperature = input.nextDouble();

                      FutureInvestmentValue  System.out.printf("\n %.1f Degrees Fahrenheit is %.1f Degrees Celsius.", userTemperature, fahrenheitToCelsius(userTemperature));
                        break;

                }else if( userInput.toUpperCase().equals("CELSIUS")){
                    System.out.print("\n Please enter the temperature in Celsius: ");
                    userTemperature = input.nextDouble();

                    System.out.printf("\n %.1f Degrees Celsius is %.1f Degrees Fahrenheit.", userTemperature, celsiusToFahrenheit(userTemperature));
                    break;
                }

            }catch(Exception e){
                System.out.println("Please enter a value measurement for temperature");

                input.next();
            }
        }
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5) * celsius + 32;
    }
}
