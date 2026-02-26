import java.math.*;

public class problem7{
    public static void main(String args[]){
        // check for prime number;

        //brute force 

        int number =145;

        for(int i=2;i<number;i++){
            if(number%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }

        System.out.println("prime number");

        //can we optimize it ?


        for (int j=2;j<Math.sqrt(number);j++){
            if(number%j==0){
                System.out.println("Not a prime number");
                return;
            }
        }

        System.out.println("prime number");

    }
}