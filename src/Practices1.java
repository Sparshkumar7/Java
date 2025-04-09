import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.SortedMap;
class Print{
    String name ;
    int age;

    Print(String na , int ag ){
        name = na;
        age = ag;
    }

    void display(){
        System.out.println("Name: "+ name + "  Age: "+ age);
    }
}
public class Practices1 {
    public static void main(String[] args) {
        Print Ob = new Print("mohit",23);
        Ob.display();
        System.out.println(Ob.getClass());

        //? Q1 Java Program to Print an Integer (Entered by the User)
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any Number: ");
//        int user = input.nextInt();
//
//        System.out.println("Print the Integer value: "+ user);

        //! Q2 Java Program to Add Two Integers
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = input.nextInt();
//        System.out.print("Enter second number: ");
//        int b = input.nextInt();
//        int sum = a + b;
//        System.out.println("Sum of the two number: "+ sum);

        //* Q3 Java Program to Multiply two Floating Point Numbers
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter First float number: ");
//        float firstfloat = input.nextFloat();
//        System.out.print("Enter Second float number: ");
//        float secondfloat = input.nextFloat();
//        float Multiply = firstfloat * secondfloat;
//        System.out.print("Multiply of two floating number: "+ Multiply);

        //? q4 Java Program to Find ASCII Value of a character
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter character: ");
//        char ch = input.next().charAt(0);
//        int ascii = ch;
//        System.out.println("ASCII value of"+ch+"is :"+ ascii);

        //! Q5 Java Program to Compute Quotient and Remainder
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Dividened: ");
//        int Dividend = input.nextInt();
//        System.out.print("Enter Divisor: ");
//        int Divisor = input.nextInt();
//
//        int Remainder = Dividend % Divisor;
//        int Quotient = Dividend / Divisor;
//        System.out.println("Remainder: "Remainder);
//        System.out.println("Quotient :"Quotient);

        //* Q6 Java Program to Swap Two Numbers
//        Scanner input = new Scanner(System.in);
//        System.out.println("Java Program to Swap Two Numbers");
//        System.out.print("Enter First Value: ");
//        int First = input.nextInt();
//        System.out.print("Enter Second Value: ");
//        int Second = input.nextInt();
//        int swap = First;
//        First =Second;
//        Second = swap;
//        System.out.println(First.getClass().getSimpleName());
//        System.out.println("Second value: "+ Second);

        //? Q7 Java Program to Convert Character to String
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any Character: ");
//        char ch = input.next().charAt(0);
//        String st = String.valueOf(ch);
//        System.out.println("String: "+ch);
//        Object a = ch;
//        System.out.println(a.getClass());

        //! 8. Java Program to convert char type variables to int
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Character: ");
//        char user = input.next().charAt(0);
//        int num = user;
//        System.out.println("Integer: "+num);
//        Object a = num;
//        System.out.println(a.getClass());

        //* 9. Java Program to convert int type variables to char
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Integer Value: ");
//        int num = input.nextInt();
//        char chara = (char) num;
//        System.out.println("Char: "+ chara);
//        Object a = chara;
//        System.out.println(a.getClass());

        //? 10. Java Program to convert long type variables into int
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Integer Value: ");
//        long num = input.nextInt();
//        int inte = (int) num;
//        System.out.println("Int: "+ inte);
//        Object a = inte;
//        Object b = num;
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());

        //! 11. Java Program to convert int type variables to long
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Integer Value: ");
//        int num = input.nextInt();
//        long lon = num;
//        System.out.println("Long: "+ lon);
//        Object a = num;
//        Object b = lon;
//
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());

        //! 12. Java Program to convert boolean variables into string
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter True/False: ");
//        boolean num = input.nextBoolean();
//        String str = String.valueOf(num);
//        System.out.println("str: "+ str );
//        Object a = num;
//        Object b = str;
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());
        // ? 13. Java Program to convert string type variables into boolean
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter String value: ");
//        String num = input.nextLine();
//        boolean bool = Boolean.valueOf(num);
//        System.out.println("boolean: "+ bool );
//        Object a = num;
//        Object b = bool;
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());

        //! 14. Java Program to convert string type variables into int
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter String value: ");
//        String num = input.nextLine();
//        int integer = Integer.valueOf(num);
//        System.out.println("convert String into integer: "+ integer );
//        Object a = num;
//        Object b = integer;
//        System.out.println("Original String type: "+a.getClass());
//        System.out.println("Converted Integer type: "+b.getClass());

//        ? 15. Java Program to convert int type variables to String
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Integer value: ");
//        int num = input.nextInt();
//        String integer = String.valueOf(num);
//        System.out.println("convert Integer into String: "+ integer );
//        Object a = num;
//        Object b = integer;
//        System.out.println("Original Integer type: "+a.getClass());
//        System.out.println("Converted String  type: "+b.getClass());

//        ? 16. Java Program to convert int type variables to double
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Integer value: ");
//        int num = input.nextInt();
//        double dou = num;
//        System.out.println("Convert into double: "+ dou);
//        Object a = num;
//        Object b = dou;
//        System.out.println("Original data type: "+ a.getClass());
//        System.out.println("Converted data type: "+ b.getClass());

//!     17. Java Program to convert double type variables to int
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Double value: ");
//        double num = input.nextDouble();
//        int dou = (int) num;
//        System.out.println("Convert into int: "+ dou);
//        Object a = num;
//        Object b = dou;
//        System.out.println("Original data type: "+ a.getClass());
//        System.out.println("Converted data type: "+ b.getClass());

        //* 18. Java Program to convert string variables to double
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter String value: ");
//        String num = input.nextLine();
//        double dou = Double.valueOf(num);
//        System.out.println("Convert into double: "+ dou);
//        Object a = num;
//        Object b = dou;
//        System.out.println("Original data type: "+ a.getClass());
//        System.out.println("Converted data type: "+ b.getClass());

//?      19. Java Program to convert double type variables to string
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter double value: ");
//        Double num = input.nextDouble();
//        String dou = String.valueOf(num);
//        System.out.println("Convert into string: "+ dou);
//        Object a = num;
//        Object b = dou;
//        System.out.println("Original data type: "+ a.getClass());
//        System.out.println("Converted data type: "+ b.getClass());

// ?       Loops & Recursion
// !       1. Java Program to Calculate the Sum of Natural Numbers
//        Scanner input = new Scanner(System.in);
//        System.out.println("Find the sum of the natural number: ");
//        int n = input.nextInt();
//        int sum= 0;
//        for(int i=1; i<=n;i++){
//            sum+=i;
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//
//  ?      2. Java Program to Find Factorial of a Number

//        Scanner input = new Scanner(System.in);
//        System.out.println("Find  Factorial: ");
//        int f = input.nextInt();
//        int mul= 1;
//        for(int i=1; i<=f;i++){
//            mul*=i;
//           System.out.print(i+"*");
//        }
//        System.out.print("= "+mul);

// !       3. Java Program to Generate Multiplication Table
//        Scanner input = new Scanner(System.in);
//        System.out.println("Generate Multiplication Table: ");
//        int table = input.nextInt();
//        for (int i=1; i<=10; i++){
//            int mul = i * table;
//            System.out.println(table +" * "+i+" = "+ mul);
//        }
//? Java Program to Display Fibonacci Series
//        Scanner input = new Scanner(System.in);
//        System.out.println("Display Fibonacci Series: ");
//        int fib = input.nextInt();
//        int first=0;
//        int second=1;
//        for (int i=0;i<fib; i++){
//            System.out.println(first);
//            int temp =first + second;
//            first = second;
//            second = temp;
//    }
        //? 6. Java Program to Display Alphabets (A to Z) using loop
//        char a;
//        for (a = 'A'; a <= 'Z'; a++) {
//            System.out.println(a);
//        }

        //* Java Program to Count Number of Digits in an Integer
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any Digits: ");
//        int D = input.nextInt();
//        int count=0;
//        while (D !=0){
//            D= D/10;
//            count++;
//        }
//        System.out.println(count);

        //? Java Program to Reverse a Number
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any Digits: ");
//        int inp = input.nextInt();
//        int reverse= 0;
//
//        while (inp !=0) {
//            int last = inp % 10;
//            reverse= reverse *10+last;
//            inp/=10;
//        }
//        System.out.println(reverse);

//*        Java Program to Calculate the Power of a Number
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Base value: ");
//        int base = input.nextInt();
//        System.out.println("Enter Power value: ");
//        int power = input.nextInt();
//        while (power!=0){
//            base*=power;
//            power--;
//        }
//        System.out.println(base);

        //? 16. Java Program to Add Two Complex Numbers by Passing Class to a Function


        }
    }

