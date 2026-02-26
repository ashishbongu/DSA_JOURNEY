public class problemStr1 {
    public static void main(String args[]){
        String name = "ashish";
        String name1 = new String("ashish");

        System.out.println(name.length());
        System.out.println(name1.equals(name));
        System.out.println(name1.compareTo(name));

        //UNderstanding Strings in java...

        String name2=name;

        System.out.println(name.equals(name2)); // true
        System.out.println(name==name1); // false


    }
}
