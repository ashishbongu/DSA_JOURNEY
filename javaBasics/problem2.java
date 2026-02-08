public class problem2{
    public static void main(String args[]){
        //reverse digits in a number

        int number = 34561;
        int reverse=0;
        //brute force

        while (number!=0){
            reverse=reverse*10+ (number%10);
            number =number/10;
        }

        System.out.println(reverse);

        //Time Complexity: O(log10 N)
    }
}