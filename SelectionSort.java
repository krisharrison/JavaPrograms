public class SelectionSort {
    public static void main(String [] args){

        int array[] = {3,8,5,12,50,6,2};//Init array with size of 7

        selectionSort(array);

        for(int element:array)//Process sorted array
            System.out.print(element + " ");//Display sorted array

    }

    /**
     * Sorts array using selection sort
     * @param array
     * @return int array
     */
    public static void selectionSort(int array[]){

       for(int firstElement = 0; firstElement < array.length - 1; firstElement++){//First element
                    int  minNum = array[firstElement];
                    int minNumIndex = firstElement;
            for(int index = firstElement + 1; index < array.length;index++){
                if(array[index] < minNum) {
                    minNum = array[index];
                    minNumIndex = index;
                }
            }

            if(minNumIndex != firstElement)//swap elements if necessary
                array[minNumIndex] = array[firstElement];
                array[firstElement] = minNum;
        }//end outer for

    }
}
