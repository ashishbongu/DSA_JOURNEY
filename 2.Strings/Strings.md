# Strings in Java

```
String name = "ashish";
```
What happens in memory
String name = "ashish";

👉 JVM checks the String Pool first.

(If "ashish" already exists → reuse it || 
If not → create ONE object in the String Pool)

#### Stack: name  ----> Heap (String Pool):"ashish"

✔ Only one object created
✔ Memory efficient
✔ Recommended way

```
String name = new String("ashish");
```

Creates a NEW String object in normal heap memory

#### Stack: name ----> Heap: [Heap Object]  "ashish"   ← new object

## ❗ Now you have two separate objects. 

![Alt text](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2012/11/String-Pool-Java1-450x249.png)


```
public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");

        // Insert at a specific index
        sb.insert(5, " Java");

        // Replace a portion
        sb.replace(6, 10, "Beautiful");

        // Delete characters
        sb.delete(15, sb.length());

        // Reverse the content
        sb.reverse();

        // Convert to a String
        String result = sb.toString();

        // Print the final result
        System.out.println(result);
    }
}
```