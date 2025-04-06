import java.util.Scanner;
public class if_else {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Basic Salary: ");
        int salary = input.nextInt();
        int Gross_1;
        int Gross_2;
        Gross_1 = salary+(salary * 10/100)+(salary * 90/100);
        Gross_2 = salary+(salary +500)+(salary*98/100);
        if (salary <1500){
            System.out.println("Gross Salary is: "+ Gross_1);
            }
        else if(salary >= 1500){
            System.out.println("Gross Salary is: "+ Gross_2 );
        }
        else{
            System.out.println("Enter vaild number 😒");
        }
    }
}
