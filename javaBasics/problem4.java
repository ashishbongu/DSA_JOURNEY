public class problem4{
    public static void main(String args[]){
        int num1=12;
        int num2=9;

        //Brute force

        int min, max, temp;
        
        if(num1>num2){
            max=num1;
            min=num2;
        }
        else{
            max=num2;
            min=num1;
        }

        while (max%min != 0){
            temp=min;
            min=max%min;
            max=temp;
        }

        System.out.println(min);



    }
}