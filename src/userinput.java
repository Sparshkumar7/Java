import java.sql.SQLOutput;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your name is "+name+" You are "+age+" Years old");
    }
}
