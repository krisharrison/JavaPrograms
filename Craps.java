import java.util.Random;


public class Craps{
    public static void main(String [] args) {




        while(true) {//While

            int die1 = rollDie();//Roll die store in die1
            int die2 = rollDie();//Roll die store in die2
            int diceTotal = die1 + die2;//Die total

            System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceTotal);//Display Results

            if(diceTotal == 7 || diceTotal == 8){//If dieTotal == 7 || 8

                System.out.println("You Win!");//Display Result
                break;//Break
            }//End if
            else if(diceTotal == 2 || diceTotal == 3 || diceTotal == 12){//If dieTotal == 2 || 3
                System.out.println("You Lose!");//Display Result
                break;
            }//End if
            else{//Else

                System.out.println("Point is " + diceTotal);

                die1 = rollDie();//Second roll for die1
                die2 = rollDie();//Second toll for die2
                diceTotal = die1 + die2;//Second Dice total

                System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceTotal);//Display results

                if(diceTotal == 7){//IF diceTotal == 7
                    System.out.println("You Lose!");//Display Results
                }//End if
                else{//Else
                    System.out.println("You Win!");//Display Results
                }//End else

                break;

            }//End else

        }//End while


    }
    /**
     * Roll Die
     * @return Integer
     */
    public static int rollDie(){
        Random die = new Random();

        return die.nextInt((6-1) + 1) + 1;//return random number between 1 and 6
    }
}
