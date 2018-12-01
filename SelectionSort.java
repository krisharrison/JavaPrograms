public class SelectionSort {
    public static void main(String [] args){

        int array[] = {3,8,5,12,50,6,2};//Init array with size of 7

        getAscendingOrder(array);//Call getAscendingOrder

        for(int element:array)//Process sorted array
            System.out.print(element + " ");//Display sorted array

        int arrayTwo[] = {3,8,5,12,50,6,2};//Init array2 with size of 7

        System.out.println();//Next Line

        getDescendingOrder(arrayTwo);//Call getDescendingOrder

        for(int element:arrayTwo)//Process arrayTwo
            System.out.print(element + " ");//Display arrayTwo

    }

    /**
     * Sorts array in ascending order
     * @param array
     *
     */
    public static void getAscendingOrder(int array[]){

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

    /**
     * Sorts array in descending order
     * @param array
     */
    public static void getDescendingOrder(int array[]){
        for(int i = 0; i < array.length-1;i++){//Outer for
            int currentMax = array[i];//Store current max
            int currentMaxIndex = i;//Store index of current max

            for(int j = i + 1; j < array.length;j++){//Inner for
                if(array[j] > currentMax){//If element array[i] > currentMax
                    currentMax = array[j];//Store array[i] in currentMax
                    currentMaxIndex = j;//Store index of current max in currentMaxIndex
                }
            }//end inner for

            //Swap if necessary
            if(currentMaxIndex != i)
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
        }//End outer for
    }

}
