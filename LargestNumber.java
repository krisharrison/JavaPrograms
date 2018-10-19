public class LargestNumber {
    public static void main(String [] args){

        int num = 12000;

        while(num > 1){

            if(Math.pow(num,3) < 12000){
                break;
            }
            num--;
        }

        System.out.println("The largest n such that ne3 < 12000: " + num);

    }
}
