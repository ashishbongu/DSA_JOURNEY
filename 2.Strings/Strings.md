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