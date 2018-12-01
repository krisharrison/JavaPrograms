public class SelectionSort {
    public static void main(String [] args){

        int array[] = {3,8,5,12,50,6,2};

        for(int element:selectionSort(array))
            System.out.print(element + " ");

    }
    public static int[] selectionSort(int array[]){
        int firstIndex = 0;
        int last = array[array.length - 1];
        int smallestNum = array[0];
        int swappedIndex = 0;
        int temp;

       for(int i = 0; i < array.length; i++){
            for(int index = 0; index < array.length;index++){
                if(array[index] < smallestNum) {
                    smallestNum = array[index];
                    swappedIndex = index;
                }

                firstIndex++;
            }

            temp = array[firstIndex];
            array[firstIndex] = smallestNum;
            array[swappedIndex] = temp;

            firstIndex = 0;
        }

        return array;
    }
}
