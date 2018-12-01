import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a key: ");
        int key = input.nextInt();

        int num [] = {3,45,8,10,23,37,1,32,4,8};
        Arrays.sort(num);

        displayResults(num,key);

    }
    public static void displayResults(int numbers[], int key){
        int result = binarySort(numbers,key);

        if(result < 0){
            System.out.print("Key Not Found!");
        }
        else{
            System.out.print("Key found at index: " + result);
        }
    }
    public static int binarySort(int numbers [], int key){
        int low = 0;
        int high = numbers.length - 1;
        int mid;

        while(high >= low){

            mid = (low + high) / 2;

            if(key < numbers[mid]){
                high = mid - 1;
            }
            else if(key == numbers[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }

        return -low - 1;

    }
}
