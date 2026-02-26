# Strings in Java

```
String name = "ashish";

```
What happens in memory
String name = "ashish";

👉 JVM checks the String Pool first.

If "ashish" already exists → reuse it
If not → create ONE object in the String Pool

Memory:

Stack:
name  ---->

Heap (String Pool):
"ashish"

✔ Only one object created (in most cases)
✔ Memory efficient
✔ Recommended way

✅ 2️⃣ String name = new String("ashish");
String name = new String("ashish");

JVM does TWO things:

Creates "ashish" in String Pool (if not already present)

Creates a NEW String object in normal heap memory

Memory:

Stack:
name ---->

Heap:
[String Pool]  "ashish"
[Heap Object]  "ashish"   ← new object

❗ Now you have two separate objects.