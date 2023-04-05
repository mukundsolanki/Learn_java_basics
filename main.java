import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //your code goes here
        // java is case sensitive
        System.out.println("Hello and welcome!");

        //VARIABLES
        String name="Mukund";
        int x=2;
        double y=1.2; //float y=1.2f; f-->represents floating point numbers
        char a='a';
        boolean b=true;
        
        // also declare multiple variable is a single line
        
        System.out.println(b);
        System.out.println(a);
        System.out.println(y);
        System.out.println(x);
        System.out.println(name);

        /* 2 types of data types -
        1.primitive-->    which has some specific size
        byte(1) , short(2), int(4), long(8), float(4), double(8), boolean(1 bit), char(2)

        2.non-primitive or Reference data types
         */
        byte u=126; // byte can store from -126 to +126 only
        System.out.println(u);

        int num1=2;
        int num2=3;
        num1 +=3; // assignment operator-- it will add 3 more in num1
        System.out.print("sum is "); //------> ln is used for output in new line
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        
        // increment/decrement operators
        System.out.println(num1--);
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(--num1);

        /* 3 logical operators
        1. && logical AND operator -- if both condition are true
        2. || logical OR operator -- if any one condition is true
        3. ! logical not -- reverse
         */


        //USER INPUT IN JAVA
        Scanner scan = new Scanner(System.in); /* Scanner- is a class
                                                  scan- is a object
                                                  System.in- keyboard se input */
        System.out.println("enter input");
        String input = scan.nextLine(); // nextline is a method, next()-- takes input only upto a whitespace
        System.out.println(input);

        //METHODS IN STRINGS
        // we can perform concatination in strings
        // str.length()-- gives length of a string
        // str.toUpperCase()-- Converts string to uppercase letters
        // str.toLowerCse()
        // \"-- to add "" in a string output
        // \\-- these are known as ESCAPE SEQUENCE CHARACTERS
        // \n-- new line
        // sout(str.contains("---")); -- this will return true or false value if string has ---
        // str.charAt(2); -- it will return the value at index
        // str.endsWith("--") -- if string ends with ---
        // str.indexOf(---); --- staring index of this particular string

        //MATH CLASS IN JAVA
        // max(), min(), sqrt(), abs()-- negative to positive, random()-- random numbers between 0-1
        // (4+(8-4))*Math.random()); -- prints random number between 4 and 8

        // IF-ELSE CONDITIONS

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int input = scan.nextInt();

        if (input > 5) {
            System.out.println("Not kid");
        }
        else
        {
            System.out.println("kid");
        }

        //SWITCH STATEMENTS

        switch (input){
            case 12:
                System.out.println("You are 12 year old");
                break;

            case 35:
                System.out.println("You are 35");
        }

        //LOOPS
        int i=0;
        while (i<100)
        {
            System.out.println(i);
            i+=1; // i++
        }

        // DO WHILE LOOP IS SAME AS CPP DO WHILE LOOP -- ek baar chalta hi chalta hai

        // FOR LOOP
        // for(--- , ---- , ---){//---------} -- SAME AS CPP

        // BREAK AND CONTINUE IS ALSO SAME AS CPP

        // ARRAYS IN JAVA
         int [] marks={1,2,3,4,5};
        marks[3]=34;

        System.out.println(marks[0]);

        for (int j=0; j<marks.length; j++)
        {
            System.out.println(marks[j]);
        }

        // FOR EACH LOOP

        for (int value:marks)
        {
            System.out.println(value);
        }

        int [] [] matrix= {{1,2,3} , {4,5,6}};
        System.out.println(matrix[0][1]);


        // TRY CATCH METHOD
        try{
            System.out.println(6);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("KUCH BHI");

        // FUNCTIONS / METHODS IN JAVA
        // upar dekh bhai line number 5 
        System.out.println(sum(5 ,5));
    }
    }
