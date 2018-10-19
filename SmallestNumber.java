public class SmallestNumber {
    public static void main(String [] args){

        int num = 1;

        while(num < 12000){

            if(Math.pow(num,2) > 12000){
                System.out.println("The smallest n such that ne2 > 12000: " + num);
                break;
            }

            num++;
        }
    }
}
