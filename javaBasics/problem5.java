public class problem5{
    public static void main(String args[]){
        //find divisors of a number

        int number =18;

        //brute force

        for (int i=1; i<=number; i++){
            if (number/i > i){
                if (number%i == 0){
                    System.out.print(i + " " + (18/i)+ " ");
                }
            }else break;
            
        }

        //Time complexity: O(N)

        //is there any optimal approach ? 




    }
}