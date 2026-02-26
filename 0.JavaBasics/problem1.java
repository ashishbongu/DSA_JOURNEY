public class problem1{
    public static void main(String args[]){
        int number=767785;
        int number1=number;
        int count=0;
        //Brute force

        while (number !=0 ){
            number=number/10;
            count++;
        }

       System.out.println(count);

       //Time complexity: O(log10 N)


       //optimal path 

       int result = (int) (Math.log10(number1) + 1);
       System.out.println(result);

       // Time complexity: O(1)
    }
}