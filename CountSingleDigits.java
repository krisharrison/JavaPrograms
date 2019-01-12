import java.util.Random;


public class CountSingleDigits {
    public static void main(String [] args){
        int randNumbers[];//Init randNumbers array
        int count[];//Init count array

        randNumbers = createArray();//Call and store createArray in randNumbers

        displayArray(randNumbers);//Display array

        count = getCount(randNumbers);//Call and store getCount in count

        displayResults(count);//Call displayArray


    }

    /**
     * Create array
     * @return
     */
    public static int[] createArray(){
        int randNumber[] = new int [100];
        Random rnd = new Random();

        for(int i=0;i<randNumber.length;i++)
            randNumber[i] = (rnd.nextInt(10));

        return randNumber;

    }

    /**
     * Display Array
     * @param randNumbers
     */
    public static void displayArray(int randNumbers[]){
        System.out.println("Created Array: ");
        for(int i=0;i<randNumbers.length;i++)

            if((i + 1) % 10 == 0){
                System.out.println(randNumbers[i] + " ");
            }
            else{
                System.out.print(randNumbers[i] + " ");
            }
    }

    /**
     * Count the number of appearance of each number
     * @param randNumbers
     * @return
     */
   public static int[] getCount(int randNumbers[]){
        int count[] = new int[10];

        for(int i=0;i<randNumbers.length;i++){
            count[randNumbers[i]]++;
        }

        return count;
    }

    /**
     * Display results
     * @param count
     */
    public static void displayResults(int count[]){

        System.out.println();
        char plural = 's';
        for(int i=0;i<count.length;i++)

            if(count[i] == 1)
                System.out.printf("%d occurs %d time\n", i,count[i]);
            else
                System.out.printf("%d occurs %d time%c\n", i,count[i],plural);
    }
}
