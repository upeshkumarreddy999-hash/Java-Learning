/*  Conditional Statements
│
├── 1. if
├── 2. if-else
├── 3. if-else-if
├── 4. else
├── 5. Multiple if
├── 6. Nested if
├── 7. Nested if-else
│
├── 8. Relational Operators
├── 9. Logical Operators
│
├── 10. Ternary Operator
│
└── 11. switch
     ├── switch-case
     ├── default
     ├── break
     └── Multiple Cases 
---------------------------------------------------------------------
1.if
Definition:
if is used to check a condition. If the condition is true, the code inside the if block will execute. 

Syntax:
if (condition) {
    // code to execute when condition is true
}
----------------------------------------------------------------------
2. if-else
Definition:
if-else is used when there are two possible results. 
If the condition is true, the if block executes.
 If the condition is false, the else block executes.

 Syntax:
 if (condition) {
    // code to execute when condition is true
} else {
    // code to execute when condition is false
}
    -----------------------------------------------------------------------
3. if-else-if
Definition:
if-else-if is used when we have multiple conditions to check.
 Java checks the conditions one by one. When a condition is true, its code executes.
 👉 Only the first TRUE condition executes. The remaining conditions are not checked.
    In an if-else-if ladder, if the first condition is false, Java checks the next condition.
 👉If the second condition is true, it executes the second block and stops. 
It will NOT execute the third condition, even if the third condition is also true.

Syntax:
 if (condition1) {
    // code
} else if (condition2) {
    // code
} else if (condition3) {
    // code
} else {
    // code when all conditions are false
}
-----------------------------------------------------------------------
4. else
Definition:
else is used to execute a block of code when the if condition is false. It is used together with an if.

Syntax:
if (condition) {
    // code when condition is true
} else {
    // code when condition is false
}
 ------------------------------------------------------------------------   
 5. Multiple if
Definition:
Multiple if means using separate if statements to check multiple conditions independently. 
If multiple conditions are true, all their blocks can execute.

-age >= 18 → ✅ true → executes
age >= 21 → ❌ false → does not execute
age >= 25 → ❌ false → does not execute
-Condition 1 → ❌ False
Condition 2 → ✅ True → executes
Condition 3 → ✅ True → executes

-Simple rule:
Multiple if → every condition is checked independently.
So yes, first can be false and the next two can both be true, and both true blocks will execute. ✅

Syntax:
if (condition1) {
    // code
}

if (condition2) {
    // code
}

if (condition3) {
    // code
}

------------------------------------------------------------------------

6. Nested if
Definition:
A nested if is an if statement placed inside another if statement. 
The inner if is checked only when the outer if condition is true.

Syntax:

if (condition1) {

    if (condition2) {
        // code
    }

}

-----------------------------------------------------------------------
7. Nested if-else
Definition:
A nested if-else means an if-else statement is placed inside another if or else block.

Syntax:
if (condition1) {

    if (condition2) {
        // code
    } else {
        // code
    }

} else {
    // code
}

How it works:

Step 1: Check condition1.
If condition1 → ❌ false
→ Outer else executes.
→ Inner if-else is not checked.
If condition1 → ✅ true
→ Java enters inside the outer if.
→ Then it checks condition2.

Step 2: Check condition2.
condition2 → ✅ true → inner if executes.
condition2 → ❌ false → inner else executes.

Easy rule:
Outer condition true → go inside → check inner condition.
Outer condition false → go to outer else → don't check inner condition.
-----------------------------------------------------------------------------
8. Relational Operators
Definition:
Relational operators are used to compare two values. The result is always true or false.

Syntax:
if (value1 > value2) {
    // code
}

Relational operators:
>    Greater than
<    Less than
>=   Greater than or equal to
<=   Less than or equal to
==   Equal to
!=   Not equal to

-------------------------------------------------------------------------------
9. Logical Operators
Definition:
Logical operators are used to combine multiple conditions or reverse a condition.
 The result is true or false.

Syntax:
if (condition1 && condition2) {
    // code
}

Logical operators:
&&   AND
||   OR
!    NOT

1. && — AND
How it works:
Both conditions must be true for the complete condition to be true.

if (condition1 && condition2) {
    // executes when BOTH are true
}

Remember:
AND → Both must be true.
Condition 1	Condition 2	Result
true	true	✅ true
true	false	❌ false
false	true	❌ false
false	false	❌ false

2. || — OR
How it works:
At least one condition must be true for the complete condition to be true.

if (condition1 || condition2) {
    // executes when at least one is true
}

Remember:
OR → Any one can be true.
Condition 1	Condition 2	Result
true	true	✅ true
true	false	✅ true
false	true	✅ true
false	false	❌ false

3. ! — NOT
How it works:
! reverses the result of a condition.
true → false
false → true
if (!(condition)) {
    // executes when condition is false
}

Here:
loggedIn → false
!loggedIn → true
Therefore, "Please login" is printed.
Remember:
NOT → Reverses the result.
Condition	!condition
true	❌ false
false	✅ true

&&  → BOTH must be true
||  → ANY ONE can be true
!   → REVERSE the result
----------------------------------------------------------------------------------------------
10. Ternary Operator

Definition:
The ternary operator is a short form of a simple if-else. 
It checks a condition and returns one of two values.

Syntax:
result = condition ? valueIfTrue : valueIfFalse;

For example:
String result = age >= 18 ? "Adult" : "Minor";

Result:
Adult
--------------------------------------------------------------------------------------------
11. switch
Definition:
switch is used to choose one block of code from multiple fixed choices based on the value of a variable or expression.

Syntax:
switch (value) {
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    case value3:
        // code
        break;

    default:
        // code when no case matches
}

How switch Works

switch compares one value with multiple case values.

Example:

int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}

Step-by-step:

1. day has the value 2.

int day = 2;

2. switch checks the value 2.

switch (day)

3. Java compares 2 with each case:
case 1 → ❌ Not matching
case 2 → ✅ Matching
case 3 → ❌ Not checked after break

4. case 2 executes:
Tuesday

5. break stops the switch.

What if no case matches?

Then default executes.

int day = 8;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}

Output:
Invalid day
Easy rule
switch → checks the value
case   → checks for a match
break  → stops the switch
default → runs when no case matches

Think of switch as: "I have one value; which option matches it?"

 case:

Definition:
case is used inside a switch to define a possible value to match.
 When the switch value matches a case, that case's code executes.

Syntax:
case value:
    // code
    break;

-----------------------------------------------------------------------------------------------------------
default:

Definition:
default is used inside a switch when none of the case values match the switch value.

Syntax:
default:
    // code when no case matches

Simple rule:
case matches → execute that case.
No case matches → execute default.

----------------------------------------------------------------------------------------------------------

break:
Definition:
break is used inside a switch to stop the switch execution after the matching case is executed.

Syntax:

case value:
    // code
    break;

Simple rule:
break → stop the switch and come out of it.

example:
public class BreakExample {
    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }

        System.out.println("Switch ended");
    }
}

How it works:

day = 2
case 1 → ❌ No match
case 2 → ✅ Match

So Java executes:
System.out.println("Tuesday");

Then:
break;

The break stops the switch. Java does not continue to case 3.

After the switch, Java continues with:
System.out.println("Switch ended");
Output
Tuesday
Switch ended

👉 Main purpose of break: Once the matching case is executed,
 break prevents Java from continuing into the next cases.

----------------------------------------------------------------------------------------

Multiple Cases

Definition:
Multiple cases means two or more case values use the same block of code.
 This is useful when different values should produce the same result.

Syntax:
switch (value) {

    case value1:
    case value2:
    case value3:
        // same code
        break;

    default:
        // code
}

example:
public class MultipleCases {
    public static void main(String[] args) {

        int day = 6;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}  

How it works:

The value is:

int day = 6;

Java enters:

switch (day)

Then it checks the cases:

case 1 → ❌ 6 != 1
case 2 → ❌ 6 != 2
case 3 → ❌ 6 != 3
case 4 → ❌ 6 != 4
case 5 → ❌ 6 != 5
case 6 → ✅ Match

Now notice:

case 6:
case 7:
    System.out.println("Weekend");
    break;

There is no code immediately after case 6.

So Java moves to the next case:

case 7:
But there is also no separate code there. Java reaches:

System.out.println("Weekend");

and executes it.

Then:
break;

stops the switch.

Output:
Weekend
What if day = 7?
int day = 7;

Then:
case 6 → ❌
case 7 → ✅
     ↓
"Weekend"

Output:
Weekend
Important concept

This:
case 6:
case 7:
    System.out.println("Weekend");
    break;

means:
If value is 6 → Weekend
If value is 7 → Weekend

So multiple cases allow different values to share the same code.
================================================================================================
 */

/*-----Looping Statements : -----
1. for Loop:
Definition:
A for loop is used to repeat a block of code multiple times when we know how many times we want to repeat it.

synatx:
for (initialization; condition; update) {
    // code to repeat
}

Example:
public class ForLoopExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}

How it works
for (int i = 1; i <= 5; i++)
int i = 1 → Initialization — starts i with 1.
i <= 5 → Condition — checks whether i is less than or equal to 5.
i++ → Update — increases i by 1 after each iteration.

Execution:

i = 1 → 1 <= 5 → print 1 → i++
i = 2 → 2 <= 5 → print 2 → i++
i = 3 → 3 <= 5 → print 3 → i++
i = 4 → 4 <= 5 → print 4 → i++
i = 5 → 5 <= 5 → print 5 → i++
i = 6 → 6 <= 5 → false → stop
Output
1
2
3
4
5

Simple rule:

for loop → start → check condition → execute → update → repeat.

next
2. while Loop

Definition:
A while loop is used to repeat a block of code as long as a condition is true. The condition is checked before each iteration.

Syntax:

while (condition) {
    // code to repeat
}
Complete Example
public class WhileLoopExample {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }
}
How it works
i = 1 → condition true  → print 1 → i becomes 2
i = 2 → condition true  → print 2 → i becomes 3
i = 3 → condition true  → print 3 → i becomes 4
i = 4 → condition true  → print 4 → i becomes 5
i = 5 → condition true  → print 5 → i becomes 6
i = 6 → condition false → stop
Output
1
2
3
4
5

Simple rule:
while loop → check condition → execute → update → check again.

while Loop — Complete Definition

A while loop is a looping statement in Java that is used to repeatedly execute a block of code as long as a specified condition is true. The condition is checked before every iteration, so if the condition is false at the beginning, the loop will not execute even once.

provide me defination in telugu english words easy to undersatand
while Loop — Easy Telugu-English Definition

Definition:
while loop ante, oka condition true ga unna varaku same code ni malli malli execute cheyadaniki use chestham.

Condition ni prathi sari loop start avvadaniki mundu check chestundi. Condition true unte code execute avutundi; condition false ayithe loop stop avutundi.

Simple ga:
👉 Condition true → code execute → malli condition check → false ayithe stop.

next
3. do-while Loop
Definition

do-while loop ante, condition true unna varaku same code ni malli malli execute cheyadaniki use chestham.

while loop tho difference enti ante, do-while lo first code execute avutundi, tarvatha condition check chestundi. Anduke condition first lo false unna kuda, code minimum one time execute avutundi.

Syntax
do {
    // code to repeat
} while (condition);
Complete Example
public class DoWhileExample {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

    }
}

How it works :
i = 1 → code execute → print 1 → condition check
i = 2 → code execute → print 2 → condition check
i = 3 → code execute → print 3 → condition check
i = 4 → code execute → print 4 → condition check
i = 5 → code execute → print 5 → condition check
i = 6 → condition false → stop
Output :
1
2
3
4
5

Simple rule:
do-while → first execute → then condition check → true ayithe repeat → false ayithe stop.

------------------------------------------------------------------------------------------------------------

2.while Loop :
Definition :
# A while loop is a looping statement in Java that is used to
 repeatedly execute a block of code as long as a specified condition is true.
The condition is checked before every iteration, so if the condition is false at the beginning,
 the loop will not execute even once.

#while loop ante, oka condition true ga unna varaku same code ni malli malli execute cheyadaniki use chestham.
Condition ni prathi sari loop start avvadaniki mundu check chestundi. 
Condition true unte code execute avutundi; condition false ayithe loop stop avutundi.

syntax:
while (condition) {
    // code to repeat
}

example:
public class WhileLoopExample {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }
}

How it works :
i = 1 → condition true  → print 1 → i becomes 2
i = 2 → condition true  → print 2 → i becomes 3
i = 3 → condition true  → print 3 → i becomes 4
i = 4 → condition true  → print 4 → i becomes 5
i = 5 → condition true  → print 5 → i becomes 6
i = 6 → condition false → stop
Output :
1
2
3
4
5

Simple rule:
while loop → check condition → execute → update → check again.


--------------------------------------------------------------------------------------------------

3. do-while Loop:

Definition:
#do-while loop ante, condition true unna varaku same code ni malli malli execute cheyadaniki use chestham.
while loop tho difference enti ante, do-while lo first code execute avutundi, 
tarvatha condition check chestundi. Anduke condition first lo false unna kuda, 
code minimum one time execute avutundi.

#A do-while loop is a looping statement in Java that repeatedly executes a
 block of code as long as the condition is true. The main difference is that the code is executed first and the
  condition is checked afterward, so the loop executes at least once, even if the condition is initially false.
syntax:
  do {
    // code to repeat
} while (condition);

example:
public class DoWhileExample {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

    }
}
How it works:
i = 1 → code execute → print 1 → condition check
i = 2 → code execute → print 2 → condition check
i = 3 → code execute → print 3 → condition check
i = 4 → code execute → print 4 → condition check
i = 5 → code execute → print 5 → condition check
i = 6 → condition false → stop
Output:
1
2
3
4
5

Simple rule:
do-while → first execute → then condition check → true ayithe repeat → false ayithe stop.

-----------------------------------------------------------------------------------------------

4. Nested Loops:

Definition:
A nested loop means one loop is placed inside another loop. 
The inner loop executes completely for each iteration of the outer loop.
Synatx:
for (initialization; condition; update) {

    for (initialization; condition; update) {
        // inner loop code
    }

}

Example:
public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }

        }
    }
}

Step-by-step workflow:
There are two loops:

Outer loop → i
Inner loop → j
Step 1: Outer loop starts
i = 1

Condition:
1 <= 3 → TRUE

So Java enters the inner loop.

Step 2: Inner loop starts
j = 1

Condition:
1 <= 2 → TRUE

Print:

i = 1, j = 1

Then j++:

j = 2

Condition:
2 <= 2 → TRUE

Print:

i = 1, j = 2

Then j++:

j = 3

Condition:
3 <= 2 → FALSE

👉 Inner loop stops.

Step 3: Outer loop moves

Now the inner loop is completely finished.

Outer loop does:

i++
i = 2

Condition:
2 <= 3 → TRUE

Again, Java enters the inner loop from the beginning.

j = 1 → print
j = 2 → print
j = 3 → stop inner loop

Output:
i = 2, j = 1
i = 2, j = 2
Step 4: Outer loop again
i++
i = 3

Condition:
3 <= 3 → TRUE

Inner loop starts again:

j = 1 → print
j = 2 → print
j = 3 → stop

Output:
i = 3, j = 1
i = 3, j = 2
Step 5: Outer loop stops

Outer loop:
i++
i = 4

Condition:
4 <= 3 → FALSE

👉 Outer loop stops. Program ends.

Complete workflow
Outer i = 1
     ↓
Inner j = 1 → execute
     ↓
Inner j = 2 → execute
     ↓
Inner stops
     ↓
Outer i = 2
     ↓
Inner j = 1 → execute
     ↓
Inner j = 2 → execute
     ↓
Inner stops
     ↓
Outer i = 3
     ↓
Inner j = 1 → execute
     ↓
Inner j = 2 → execute
     ↓
Inner stops
     ↓
Outer i = 4 → condition false
     ↓
STOP
⭐ Most important rule

For every ONE iteration of the outer loop, the inner loop runs completely.

Here:
Outer loop = 3 times
Inner loop = 2 times for each outer iteration

Total executions = 3 × 2 = 6

This is why nested loops are commonly used for patterns, tables, matrices, 2D arrays, and comparing multiple items.
------------------------------------------------------------------------------------------
5. Enhanced for Loop (For-Each Loop)
Definition:
#An enhanced for loop, also called a for-each loop, 
is used to read or process each element of an array or collection one by one without manually managing the index.

#Clear Definition:
An enhanced for loop, also called a for-each loop,
 is used to iterate through each element of an array or collection one by one.
  It automatically gets the elements in sequence, so you do not need to use an index or manually increase a counter.
Simple meaning:
👉 It takes each element one by one and executes the loop code for each element.

Syntax:
for (dataType variable : arrayOrCollection) {
    // code
}

example :
public class EnhancedForExample {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

Step-by-Step Workflow :
1. Program starts

Java starts execution from:

public static void main(String[] args)
2. Array is created
int[] numbers = {10, 20, 30, 40, 50};

The array contains 5 elements:

Index:    0    1    2    3    4
          ↓    ↓    ↓    ↓    ↓
Value:   10   20   30   40   50
3. Enhanced for loop starts
for (int number : numbers)

Read this as:

"Take each value from numbers and store it temporarily in number."

4. First iteration

Java takes the first element:

number = 10

Then executes:

System.out.println(number);

Output:

10
5. Second iteration

Java automatically takes the next element:

number = 20

Then:

System.out.println(number);

Output:

20
6. Third iteration
number = 30

Output:

30
7. Fourth iteration
number = 40

Output:

40
8. Fifth iteration
number = 50

Output:

50
9. No more elements

The array has no more elements.

So the loop automatically stops.

There is no need to write:

number++;

and there is no need to write:

number < 5

because the enhanced for loop automatically moves through all elements.

Complete Workflow
numbers = {10, 20, 30, 40, 50}
              ↓
         Take 10
              ↓
       number = 10
              ↓
          print 10
              ↓
         Take 20
              ↓
       number = 20
              ↓
          print 20
              ↓
         Take 30
              ↓
       number = 30
              ↓
          print 30
              ↓
         Take 40
              ↓
       number = 40
              ↓
          print 40
              ↓
         Take 50
              ↓
       number = 50
              ↓
          print 50
              ↓
       No elements left
              ↓
            STOP
Output
10
20
30
40
50
⭐ Key Difference

Normal for loop:

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

You manage the index yourself.

Enhanced for loop:

for (int number : numbers) {
    System.out.println(number);
}
Java automatically gives you each element one by one.

#Not only arrays. ✅
The enhanced for loop (for-each loop) can be used with:
Arrays ✅
Collections such as:
ArrayList
LinkedList
HashSet
etc. ✅

==========================================================================================
*/

/*
--------------Jumping Statement :--------------

1. break — Jumping Statement
Definition:
The break statement is used to immediately stop a loop or switch statement.
 When Java reaches break, it exits the current loop and continues executing the code after the loop.

Syntax:
break;

Complete Example:
public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Loop ended");
    }
}

Workflow:
i = 1
  ↓
i == 3 → false
  ↓
print 1

i = 2
  ↓
i == 3 → false
  ↓
print 2

i = 3
  ↓
i == 3 → true
  ↓
break
  ↓
STOP LOOP
  ↓
"Loop ended"
Output
1
2
Loop ended
Simple Rule

👉 break → immediately stop the current loop and come out of it.
------------------------------------------------------------------------

2. continue — Jumping Statement
Definition:
The continue statement is used to skip the current iteration of a loop and move directly
 to the next iteration. Unlike break, it does not stop the entire loop.

Syntax:
continue;

Complete Example:
public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

    }
}
Workflow:
i = 1
 ↓
i == 3 → false
 ↓
print 1

i = 2
 ↓
i == 3 → false
 ↓
print 2

i = 3
 ↓
i == 3 → true
 ↓
continue
 ↓
SKIP i = 3
 ↓
go to next iteration

i = 4
 ↓
print 4

i = 5
 ↓
print 5
Output
1
2
4
5
Simple Rule:
👉 continue → skip the current iteration and continue with the next iteration.

Important Difference
break     → STOP the entire loop
continue  → SKIP current iteration, loop continues

-------------------------------------------------------
3. return — Jumping Statement
Definition:
#The return statement is used to exit from a method immediately.
 It can also send a value back to the place where the method was called.

#return:
return statement ante current method ni immediate ga stop chesi, 
method nundi bayataki ravadaniki use chestham.
Method oka value calculate chesinappudu,
 aa value ni method ni call chesina place ki back pampadaniki kuda return use chestham.

Syntax:
For returning a value:

return value;

For returning without a value:

return;

Complete Example:
public class ReturnExample {

    static int addNumbers() {
        int a = 10;
        int b = 20;

        return a + b;
    }

    public static void main(String[] args) {

        int result = addNumbers();

        System.out.println(result);
    }
}
Workflow:
main()
   ↓
addNumbers() called
   ↓
a = 10
b = 20
   ↓
a + b = 30
   ↓
return 30
   ↓
30 goes back to main()
   ↓
result = 30
   ↓
print result
Output
30
Simple Rule:

👉 return → exits the current method and optionally sends a value back.

Jumping Statements Complete
break → stops the loop/switch
continue → skips the current loop iteration
return → exits the method

Simple ga:
👉 return → method ni stop chesi, value unte aa value ni back pampisthundi.
*/