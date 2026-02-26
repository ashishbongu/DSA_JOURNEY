public class problem3{


    static int reverse(int number){
        int reverse =0;

        while(number!=0){
            reverse = reverse*10+(number%10);
            number=number/10;
        }

        return reverse;
    }

    public static void main(String args[]){
        int number=13431;

        // find palindrome for this number

        if (number == reverse(number)){
            System.out.println("palindrome!!");
        }else{
            System.out.println("Not palidrome!!");
        }

        //Time complexity: O(log10 N)

    }
}